package com.uptech.smarthomeimplmqtt.sensorInfo;

public class SensorInfo {
    private String _id;
    private int sensorID;
    private  String data_one;
    private String data_two;
    private String data_three;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public int getSensorID() {
        return sensorID;
    }

    public void setSensorID(int sensorID) {
        this.sensorID = sensorID;
    }

    public String getData_one() {
        return data_one;
    }

    public void setData_one(String data_one) {
        this.data_one = data_one;
    }

    public String getData_two() {
        return data_two;
    }

    public void setData_two(String data_two) {
        this.data_two = data_two;
    }

    public String getData_three() {
        return data_three;
    }

    public void setData_three(String data_three) {
        this.data_three = data_three;
    }

    @Override
    public String toString() {
        return "SensorInfo{" +
                "_id=" + _id +
                ", sensorID=" + sensorID +
                ", data_one='" + data_one + '\'' +
                ", data_two='" + data_two + '\'' +
                ", data_three='" + data_three + '\'' +
                '}';
    }
}
