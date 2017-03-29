package com.iomonad.jacinthe.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by iomonad on 29/03/17.
 */

public class HiveList {
    @SerializedName("instances")
    private List<String> hiveInstances = new ArrayList<String>();

    public HiveList(List<String> hiveInstances) {
        this.hiveInstances = hiveInstances;
    }

    /* Sort array of deployed instances */
    public List<String> getHiveInstances() {
        return hiveInstances;
    }

    /* Return number of instances  */
    public Integer getNumberInstances(List<String > hiveInstances) {
        return hiveInstances.size();
    }
}
