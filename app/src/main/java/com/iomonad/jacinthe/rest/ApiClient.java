package com.iomonad.jacinthe.rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by iomonad on 29/03/17.
 */

public class ApiClient {
    public static final String Base_Url = "http://ruche.sti2dbac.fr/";
    private static Retrofit retrofit = null; /* Static retrofit instance */

    public static Retrofit getClient() {
        if(retrofit == null) {
            /* Create our retrofit object */
            retrofit = new Retrofit.Builder()
                    .baseUrl(Base_Url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit; /* Object with retrofit type returned */
    }
}
