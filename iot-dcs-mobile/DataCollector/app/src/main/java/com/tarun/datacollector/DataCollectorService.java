package com.tarun.datacollector;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface DataCollectorService {

    @POST("datacollector")
    Call<DeviceData> sendDeviceData(@Body DeviceData user);
}
