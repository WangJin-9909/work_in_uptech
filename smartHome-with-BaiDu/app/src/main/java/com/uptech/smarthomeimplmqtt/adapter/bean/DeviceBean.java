package com.uptech.smarthomeimplmqtt.adapter.bean;

import android.view.View;

import java.io.Serializable;

public class DeviceBean implements Serializable{
    private  int deviceID;
    private String title;
    private String desc;
    private String time;
    private String mesg;
    private int mesg_textColor;
    private int mesg_BgColor;
    private int mesg_TextSize;
    private int item_BgColor;
    private View view;

    public DeviceBean(String title, String desc, String time, String mesg,int deviceID) {
        this.title = title;
        this.desc = desc;
        this.time = time;
        this.mesg = mesg;
        this.deviceID = deviceID;
    }

    public int getItem_BgColor() {
        return item_BgColor;
    }

    public void setItem_BgColor(int item_BgColor) {
        this.item_BgColor = item_BgColor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMesg() {
        return mesg;
    }

    public void setMesg(String mesg) {
        this.mesg = mesg;
    }

    public int getMesg_textColor() {
        return mesg_textColor;
    }

    public void setMesg_textColor(int mesg_textColor) {
        this.mesg_textColor = mesg_textColor;
    }

    public int getMesg_BgColor() {
        return mesg_BgColor;
    }

    public void setMesg_BgColor(int mesg_BgColor) {
        this.mesg_BgColor = mesg_BgColor;
    }

    public int getMesg_TextSize() {
        return mesg_TextSize;
    }

    public void setMesg_TextSize(int mesg_TextSize) {
        this.mesg_TextSize = mesg_TextSize;
    }
    public int getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(int deviceID) {
        this.deviceID = deviceID;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

}
