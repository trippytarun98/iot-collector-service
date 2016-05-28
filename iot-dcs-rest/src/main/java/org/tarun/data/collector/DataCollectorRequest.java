package org.tarun.data.collector;


import java.util.HashMap;
import java.util.Map;

public class DataCollectorRequest {

    private String requestId;
    private String deviceName;
    private Map<String,String> deviceData = new HashMap<String, String>();
    private String deviceId;


    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public Map<String, String> getDeviceData() {
        return deviceData;
    }

    public void setDeviceData(Map<String, String> deviceData) {
        this.deviceData = deviceData;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
}
