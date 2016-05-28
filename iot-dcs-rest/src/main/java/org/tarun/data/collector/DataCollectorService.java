package org.tarun.data.collector;


import com.google.gson.Gson;
import org.tarun.data.collector.data.DataCollectorRepository;
import org.tarun.data.collector.data.DataCollectorRepositoryImpl;
import org.tarun.data.collector.data.model.DeviceData;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/datacollector")
public class DataCollectorService {

    @GET
    @Path("/echo/{param}")
    public Response echo(@PathParam("param") String msg) {
        String output = "Echo from Data Collector Service :" + msg;
        return Response.status(200).entity(output).build();
    }


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response saveData(DataCollectorRequest request) {
        Gson gson = new Gson();
        System.out.println("Received request :" + gson.toJson(request));
        DeviceData deviceData = new DeviceData();
        deviceData.setDeviceId(request.getDeviceId());
        deviceData.setDeviceData(request.getDeviceData());
        deviceData = DataCollectorRepositoryImpl.getInstance().saveData(deviceData);

        return Response.status(200).entity(gson.toJson(deviceData)).build();
    }


}