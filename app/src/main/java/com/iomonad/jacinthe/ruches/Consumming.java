package com.iomonad.jacinthe.ruches;

/**
 * Created by fobae on 27/03/17.
 * http://www.erenpinaz.com/blog/post/2016/3/consuming-restful-web-service-android-part-2
 */

import org.json.JSONException;
import org.json.JSONObject;

public class Consumming {
    /* Private values */
    private String instance;
    private float temperature;
    private float weight;
    private float humidity;
    private float io;
    private String lastdate;


    /* Constructor of the object */
    public Consumming(JSONObject object) {
        try {
            /* Parse object to private values */
            this.instance = object.getString("instance");
            this.temperature = object.getString("temperature");
            this.weight = object.getString("weight");
            this.humidity = object.getString("humidity");
            this.io = object.getString("io");
            this.lastdate = object.getString("date");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* Sort values */
    public float getTemperature() {
        return this.temperature;
    }
    public float getWeight() {
        return this.weight;
    }
    public float getHumidity() {
        return this.humidity;
    }
    public float getIo() {
        return this.io;
    }
    public String getLastdate() {
        return this.lastdate;
    }
    public String getInstance() {
        return this.instance;
    }
}
