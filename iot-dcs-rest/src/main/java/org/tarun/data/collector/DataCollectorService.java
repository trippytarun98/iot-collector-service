package org.tarun.data.collector;


import com.google.gson.Gson;

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
    public Response getMsg(DataCollectorRequest request) {
        Gson gson = new Gson();
        System.out.println("Received request :" + gson.toJson(request));
        return Response.status(200).entity(gson.toJson(request)).build();
    }


}