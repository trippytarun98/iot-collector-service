package com.tarun.datacollector;


import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DataCollectorServiceClient {

    public static final String BASE_URL = "http://10.0.3.2:8080/rest/";
    //public static final String BASE_URL = "http://10.0.0.5:8080/rest";
    private static DataCollectorService dataCollectorService = null;
    private static final DataCollectorServiceClient INSTANCE = new DataCollectorServiceClient();

    public static DataCollectorServiceClient getInstance() {
        return INSTANCE;
    }
    public DataCollectorServiceClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        dataCollectorService =
                retrofit.create(DataCollectorService.class);
    }

    public void sendDeviceData(DeviceData deviceData) {


        Log.i("Sending Data","calling remote server");
        Call<DeviceData> call = dataCollectorService.sendDeviceData(deviceData);
        call.enqueue(new Callback<DeviceData>() {
            @Override
            public void onResponse(Call<DeviceData> call, Response<DeviceData> response) {
                int statusCode = response.code();
                DeviceData responseData = response.body();
                Log.i("SERVER RESPONSE",responseData.toString());
            }

            @Override
            public void onFailure(Call<DeviceData> call, Throwable t) {
                // Log error here since request failed
                Log.i("Network error",t.getMessage());
                t.printStackTrace();
            }
        });

    }

}
