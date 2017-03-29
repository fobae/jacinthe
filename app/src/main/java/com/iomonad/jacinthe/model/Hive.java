package com.iomonad.jacinthe.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by iomonad on 29/03/17.
 */

public class Hive {
    /*
    * Deserialize from json resource
    */
    @SerializedName("instance")
    private String instance;
    @SerializedName("temperature")
    private Float temperature;
    @SerializedName("weight")
    private Float weight;
    @SerializedName("humidity")
    private Float humidity;
    @SerializedName("io")
    private Integer io;
    @SerializedName("date")
    private String date;

    /* Parse to constructor */
    public Hive(String instance, Float temperature, Float weight, Float humidity, Integer io, String date) {
        this.instance = instance;
        this.temperature = temperature;
        this.weight = weight;
        this.humidity = humidity;
        this.io = io;
        this.date = date;
    }

    /* Retrieve Values */
    public String getInstance() {
        return instance;
    }

    public Float getTemperature() {
        return temperature;
    }

    public Float getWeight() {
        return weight;
    }

    public Float getHumidity() {
        return humidity;
    }

    public Integer getIo() {
        return io;
    }

    public String getDate() {
        return date;
    }
}
