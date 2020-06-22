package com.uptech.smarthomeimplmqtt.mqtt;

import org.eclipse.paho.client.mqttv3.MqttCallback;

public interface MQTTCallback extends MqttCallback {
    void onParamError(String msg);

    void onstarted();
}
