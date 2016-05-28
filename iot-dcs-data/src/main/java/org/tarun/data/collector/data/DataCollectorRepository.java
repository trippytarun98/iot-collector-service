package org.tarun.data.collector.data;


import org.tarun.data.collector.data.model.DeviceData;

public interface DataCollectorRepository {

    public DeviceData saveData(DeviceData deviceData);
}
