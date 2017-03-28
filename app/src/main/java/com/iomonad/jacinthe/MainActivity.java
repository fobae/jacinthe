package com.iomonad.jacinthe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.iomonad.jacinthe.api.*;

public class MainActivity extends AppCompatActivity {

    private String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
