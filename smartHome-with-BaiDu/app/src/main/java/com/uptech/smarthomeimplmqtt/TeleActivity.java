package com.uptech.smarthomeimplmqtt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.uptech.smarthomeimplmqtt.base.UptechBaseActivity;
import com.uptech.smarthomeimplmqtt.mqtt.MQTTManagerThread;
import com.uptech.smarthomeimplmqtt.mqtt.SensorBean;

import org.jetbrains.annotations.Nullable;

public class TeleActivity extends UptechBaseActivity implements View.OnClickListener {
    private int deviceID;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telecontroller);
        Intent intent = getIntent();
        deviceID = intent.getIntExtra("deviceID",0);
    }


    void sendMesg(int status)
    {
        SensorBean sb = new SensorBean();
        sb.getDesired().setStatus(status);
        sb.setRequestId(MQTTManagerThread.getInstance().generateRequestId());
        MQTTManagerThread.getInstance().sendMessage(String.valueOf(deviceID),sb.toString());
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btn_0:
                sendMesg(0);
                break;
            case R.id.btn_1:
                sendMesg(1);
                break;
            case R.id.btn_2:
                sendMesg(2);
                break;
            case R.id.btn_3:
                sendMesg(3);
                break;
            case R.id.btn_4:
                sendMesg(4);
                break;
            case R.id.btn_5:
                sendMesg(5);
                break;
            case R.id.btn_6:
                sendMesg(6);
            break;
            case R.id.btn_7:
                sendMesg(7);
            break;
            case R.id.btn_8:
                sendMesg(8);
                break;
            case R.id.btn_9:
                sendMesg(9);
                break;
            case R.id.btn_open:
                sendMesg(16);
                break;
            case R.id.btn_close:
                sendMesg(16);
                break;
            case R.id.btn_menu:
                sendMesg(17);
                break;
            case R.id.btn_chup:
                sendMesg(19);
                break;
            case R.id.btn_chdown:
                sendMesg(20);
                break;
            case R.id.btn_voldown:
                sendMesg(21);
                break;
            case R.id.btn_volup:
                sendMesg(22);
                break;
            case R.id.btn_quit:
                sendMesg(18);
                break;
        }
    }
}
