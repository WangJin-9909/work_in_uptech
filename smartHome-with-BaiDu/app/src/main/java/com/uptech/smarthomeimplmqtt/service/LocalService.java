package com.uptech.smarthomeimplmqtt.service;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;

import com.google.gson.Gson;
import com.uptech.smarthomeimplmqtt.R;
import com.uptech.smarthomeimplmqtt.base.MyApplication;
import com.uptech.smarthomeimplmqtt.database.MyContentProvider;
import com.uptech.smarthomeimplmqtt.mqtt.MQTTCallback;
import com.uptech.smarthomeimplmqtt.mqtt.MQTTManagerThread;
import com.uptech.smarthomeimplmqtt.mqtt.SensorBean;
import com.uptech.smarthomeimplmqtt.sensorInfo.CommonSensorInfo;
import com.uptech.smarthomeimplmqtt.sensorInfo.SHT11Info;
import com.uptech.smarthomeimplmqtt.utils.Const;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.IMqttMessageListener;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;

import java.util.Calendar;

public class LocalService extends Service {

    private static final String TAG = "LocalService";
    private MyApplication app;
    private MqttClient mqttClient;

    private MQTTManagerThread mqttManager;

    MQTTCallback mqttCallback = new MQTTCallback() {
        @Override
        public void onParamError(String msg) {
           app.showToast(msg);
            if(msg == "客户机未连接") mqttManager.start();
        }

        @Override
        public void onstarted() {
            final  int[] dev_all_id = app.getIntArray(R.array.dev_all_id) ;
            Integer[] device_name = new Integer[dev_all_id.length*10];
            for(int i = 0 ; i < dev_all_id.length ; i ++)
            {
                for (int j = 0 ; j < 10 ; j ++)
                {
                    device_name[10*i + j] = dev_all_id[i] + j;
                }
            }
            try {
                int len = device_name.length;
                mqttClient = mqttManager.getClient();
                MqttReceiver mqttReceiver = new MqttReceiver();
                String[] topicFilters = new String[len];
                MqttReceiver[] receivers = new MqttReceiver[len];
                for(int i = 0 ; i <len ; i ++) {
                    topicFilters[i] = mqttManager.getUpdateAcceptedTopic(device_name[i].toString());
                    receivers[i] = mqttReceiver;
                }
                mqttClient.subscribe(topicFilters,receivers);
            } catch (MqttException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void connectionLost(Throwable throwable) {
            app.showToast("connectionLost");
            throwable.printStackTrace();
            mqttManager.start();
        }

        @Override
        public void messageArrived(String s, MqttMessage mqttMessage) {
//            Log.e(TAG, "messageArrived: " + s );
//            Log.e(TAG, "messageArrived: " + mqttMessage.getPayload().toString() );
        }

        @Override
        public void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken) {
//            Log.e(TAG, "deliveryComplete: " + iMqttDeliveryToken.isComplete() );

        }
    };

    @Override
    public void onCreate() {
        app = (MyApplication) getApplicationContext();
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        String mbroker = intent.getExtras().getString("mbroker");
        String musername = intent.getExtras().getString("musername");
        String mpassword = intent.getExtras().getString("mpassword");
        mqttManager = MQTTManagerThread.getInstance();
        mqttManager.setAddr(mbroker);
        mqttManager.setUserName(musername);
        mqttManager.setPassword(mpassword);
        mqttManager.setMqttCallback(mqttCallback);
        mqttManager.setConnectionTimeOut(10);
        mqttManager.start();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Log.i(TAG, "Local Service will Destroy.");
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    class MqttReceiver implements IMqttMessageListener {
        @Override
        public void messageArrived(String topic, MqttMessage message) {
            Log.e(TAG, ": " + message.toString() );
            String[] elements = topic.split("/");
            String devName = "unknown";
            if(elements.length >=4 )
                devName = elements[3];
            if(TextUtils.isDigitsOnly(devName))
            {
                CommonSensorInfo commonSensorInfo;
                int device_id = Integer.parseInt(devName);
//                Log.e(TAG, device_id + ": " + message.toString() );
                Long timeMillis = Calendar.getInstance().getTimeInMillis();
                Intent intent = new Intent();
                ContentValues values = new ContentValues();
                intent.setAction(Const.SensorInfoAction);
                intent.putExtra("sensorID",device_id);
                values.put(Const.ID_TEXT,timeMillis.toString());
                values.put(Const.SENSORID_TEXT,device_id);
                if(device_id >= 2048 && device_id <= 2303)
                {
                    SHT11Info sht11Info = new Gson().fromJson(message.toString(),SHT11Info.class);
                    if(sht11Info.getReported().getData1() == 0.0 || sht11Info.getReported().getData2() == 0.0) return;
                    values.put(Const.DAT_ONE_TEXT,String.valueOf(sht11Info.getReported().getData1()));
                    values.put(Const.DAT_TWO_TEXT,String.valueOf(sht11Info.getReported().getData2()));
                    intent.putExtra("temprature",sht11Info.getReported().getData2());
                    intent.putExtra("humidity",sht11Info.getReported().getData1());
//                    Log.e(TAG, device_id + "    messageArrived: " + sht11Info.getReported().getData1() );
                    sendBroadcast(intent);
                }
                else if(device_id >= 56064 && device_id <= 56319)
                {
                    commonSensorInfo = new Gson().fromJson(message.toString(),CommonSensorInfo.class);
                    if(commonSensorInfo.getReported().getStatus() == 33 || commonSensorInfo.getReported().getStatus() == 18 ) {
                        values.put(Const.DAT_ONE_TEXT, String.valueOf(commonSensorInfo.getReported().getStatus()));
                        intent.putExtra("status",commonSensorInfo.getReported().getStatus());
//                        Log.e(TAG, device_id + "    messageArrived: " + commonSensorInfo.getReported().getStatus() );
                        sendBroadcast(intent);
                    }
                    else {
                        intent.putExtra("status",commonSensorInfo.getDesired().getStatus());
                        sendBroadcast(intent);
                        return;
                    }
                }
                else{
                    commonSensorInfo = new Gson().fromJson(message.toString(),CommonSensorInfo.class);
                    if(commonSensorInfo.getReported().getStatus() == 0 || commonSensorInfo.getReported().getStatus() == 1 ) {
                        values.put(Const.DAT_ONE_TEXT, String.valueOf(commonSensorInfo.getReported().getStatus()));
                        intent.putExtra("status",commonSensorInfo.getReported().getStatus());
//                        Log.e(TAG, device_id + "    messageArrived: " + commonSensorInfo.getReported().getStatus() );
                        sendBroadcast(intent);
                    }
                    else
                    {
                        intent.putExtra("status",commonSensorInfo.getDesired().getStatus());
                        sendBroadcast(intent);
                        return;
                    }
                }
                getContentResolver().insert(MyContentProvider.getUri(String.valueOf(device_id)),values);
            }
        }
    }
}