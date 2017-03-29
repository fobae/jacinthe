package com.iomonad.jacinthe.rest;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import com.iomonad.jacinthe.model.Hive;
import com.iomonad.jacinthe.model.HiveResponse;

/**
 * Created by iomonad on 29/03/17.
 * Get methodology interface
 */

public interface ApiInterface {
    @GET("hive")
    Call<HiveResponse> getInstances();
}
