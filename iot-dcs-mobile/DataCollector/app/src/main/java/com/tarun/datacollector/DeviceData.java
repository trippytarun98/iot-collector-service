package com.tarun.datacollector;


import java.util.HashMap;

public class DeviceData {
    private String deviceId;
    private HashMap<String,String> deviceData = new HashMap<String,String>();

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public HashMap<String, String> getDeviceData() {
        return deviceData;
    }

    public void setDeviceData(HashMap<String, String> deviceData) {
        this.deviceData = deviceData;
    }
}
