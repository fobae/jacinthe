package com.iomonad.jacinthe.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;
/**
 * Created by iomonad on 29/03/17.
 * Parse instances
 */

public class HiveResponse {
    @SerializedName("instance")
    private List<Hive> instances; /* Instance array */

    public HiveResponse(List<Hive> res) {
        this.instances = res;
    }
    public List<Hive> getInstances() {
        return instances;
    }
}

