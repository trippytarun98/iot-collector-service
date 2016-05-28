package org.tarun.data.collector.data;


import com.datastax.driver.core.*;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.tarun.data.collector.data.model.DeviceData;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.TimeZone;
import java.util.UUID;
import java.util.logging.Logger;

public class DataCollectorRepositoryImpl implements DataCollectorRepository {
    Logger logger = Logger.getLogger(DataCollectorRepositoryImpl.class.getName());

    private static DataCollectorRepositoryImpl INSTANCE = new DataCollectorRepositoryImpl();

    public static DataCollectorRepository getInstance() {
        return INSTANCE;
    }
    public DeviceData saveData(DeviceData deviceData) {
        String id = UUID.randomUUID().toString();
        String currentTime = getCurrentDate();
        deviceData.setInternalId(id);
        ResultSet result = getSession().execute("INSERT INTO Device JSON '" + getGson().toJson(deviceData) +"';");
        return deviceData;
    }


    private static Cluster cluster;
    private static Session session;

    public Session getSession() {
        return session;
    }

    public String getCurrentDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        String sDate = sdf.format(new Date()) + "Z";
        return sDate;
    }

    public Gson getGson() {
        return new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
    }

    public DataCollectorRepositoryImpl() {
        connect("127.0.0.1","collectordb");
    }

    public void connect(String node, String keySpace) {
        if(cluster == null) {
            cluster = Cluster.builder()
                    .addContactPoint(node).build();
            Metadata metadata = cluster.getMetadata();
            System.out.printf("Connected to cluster: %s\n",
                    metadata.getClusterName());
            for (Host host : metadata.getAllHosts()) {
                System.out.printf("Data center: %s; Host: %s; Rack: %s\n",
                        host.getDatacenter(), host.getAddress(), host.getRack());
            }
        }

        if(session == null) {
            session = cluster.connect();
            session.execute("USE " + keySpace);

        }
    }

}
