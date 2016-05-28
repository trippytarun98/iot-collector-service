package org.tarun.data.collector;


import java.util.HashMap;
import java.util.Map;

public class DataCollectorRequest {

    private String requestId;
    private String deviceName;
    private Map<String,String> data = new HashMap<String, String>();


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

    public Map<String, String> getData() {
        return data;
    }

    public void setData(Map<String, String> data) {
        this.data = data;
    }
}
