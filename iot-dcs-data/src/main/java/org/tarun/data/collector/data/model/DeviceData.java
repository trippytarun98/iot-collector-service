package org.tarun.data.collector.data.model;


import java.util.HashMap;
import java.util.Map;

public class DeviceData {
    private String internalId;
    private String deviceId;
    private Map<String,String> deviceData = new HashMap<String, String>();

    public String getDeviceId() {
        return deviceId;
    }

    public DeviceData setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    public String getInternalId() {
        return internalId;
    }

    public DeviceData setInternalId(String internalId) {
        this.internalId = internalId;
        return this;
    }

    public Map<String, String> getDeviceData() {
        return deviceData;
    }

    public DeviceData setDeviceData(Map<String, String> deviceData) {
        this.deviceData = deviceData;
        return this;
    }
}
