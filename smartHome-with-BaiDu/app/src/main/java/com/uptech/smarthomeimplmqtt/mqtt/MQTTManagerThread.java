package com.uptech.smarthomeimplmqtt.mqtt;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

/**
 * **********************************************
 *
 * @author up-tech@jianghj
 * @version 1.0
 * @fileName: MQTTManagerThread.java
 * **********************************************
 * @descriprion 管理mqttclient类
 * @email: huijun2014@sina.cn
 * @time 2018-09-12 13:38
 *************************************************/
public class MQTTManagerThread extends Thread {
    private MqttClient mqttClient;
    private int connectionTimeOut;
    private String mbroker;
    private String musername;
    private String mpassword;
    private String mclientid;
    private String mtopic;
    private MQTTCallback callback;
    private static MQTTManagerThread instance;

    public static synchronized MQTTManagerThread getInstance() {
        if (instance == null) {
            synchronized (MQTTManagerThread.class) {
                if (instance == null) {
                    instance = new MQTTManagerThread();
                }
            }
        }
        return instance;
    }

    private MQTTManagerThread() {

    }

    public void sendMessage(String devName,String message)
    {
        MqttMessage mqttMessage = new MqttMessage(message.getBytes());
        try {
            if(mqttClient != null) {
                mqttClient.publish(getUpdateTopic(devName), mqttMessage);
            }
        } catch (MqttException e) {
            reportError(e.getMessage());
            e.printStackTrace();
        }
    }
    public void setAddr(String addr) {
        this.mbroker = addr;
    }

    public void setUserName(String userName) {
        this.musername = userName;
    }

    public void setPassword(String password) {
        this.mpassword = password;
    }

    public void setConnectionTimeOut(int timeout)
    {
        this.connectionTimeOut = timeout;
    }

    public void setMqttCallback(MQTTCallback mqttCallback)
    {
        this.callback = mqttCallback;
    }

    public MqttClient getClient()
    {
        return mqttClient;
    }

    private void reportError(String error)
    {
        if(callback != null)
            callback.onParamError(error);
    }
    @Override
    public synchronized void start() {
        if(musername == null || musername.isEmpty())
        {
            reportError("username is null,can't start MQTTClient !");
            return;
        }
        if(mpassword == null || mpassword.isEmpty())
        {
            reportError("mpassword is null,can't start MQTTClient !");
            return;
        }
        if(mbroker == null || mbroker.isEmpty())
        {
            reportError("address is null,can't start MQTTClient !");
            return;
        }
        if(connectionTimeOut <= 5)
            connectionTimeOut = 5;
        if(Build.VERSION.SDK_INT >= 23)
            super.start();
    }

    @Override
    public void run() {
        while (true) {
            try {
                MqttConnectOptions mconnOpts = new MqttConnectOptions();
                mconnOpts.setUserName(musername);
                mconnOpts.setPassword(mpassword.toCharArray());
                mconnOpts.setConnectionTimeout(connectionTimeOut);           // 设置超时时间
                mqttClient = new MqttClient(mbroker, MqttClient.generateClientId(), new MemoryPersistence());
                mqttClient.connect(mconnOpts);
                if (this.callback != null) {
                    mqttClient.setCallback(callback);
                    callback.onstarted();
                }
                break;
            } catch (Exception ex) {
                ex.printStackTrace();
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public String generateRequestId() {
        return "request" + System.nanoTime();
    }

    /**
     * 获取 update topic
     */
    public String getUpdateTopic(String deviceName) {
        if (TextUtils.isEmpty(deviceName)) return null;
        else return String.format("$baidu/iot/shadow/%s/update", deviceName);
    }

    /**
     * 获取 update accepted topic
     */
    public String getUpdateAcceptedTopic(String deviceName) {
        if (TextUtils.isEmpty(deviceName)) return null;
        else return String.format("$baidu/iot/shadow/%s/update/accepted", deviceName);
    }

    /**
     * 获取 update accepted topic
     */
    public String getDeltaTopic(String deviceName) {
        if (TextUtils.isEmpty(deviceName)) return null;
        else return String.format("$baidu/iot/shadow/%s/delta", deviceName);
    }

}
