package com.iomonad.jacinthe;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;
import android.os.Bundle;

import com.iomonad.jacinthe.model.HiveResponse;
import com.iomonad.jacinthe.rest.ApiClient;
import com.iomonad.jacinthe.rest.ApiInterface;

import retrofit2.Call;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    private final static String API_KEY = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (API_KEY.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Please obtain your API KEY", Toast.LENGTH_LONG).show();
            return;
        }
        /* refered as local package */
        ApiInterface apiService =
                ApiClient.getClient().create(ApiInterface.class);

        Call<HiveResponse> call = apiService.getInstances();
    }
}
