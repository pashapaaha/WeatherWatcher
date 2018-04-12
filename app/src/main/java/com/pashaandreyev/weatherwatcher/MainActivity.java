package com.pashaandreyev.weatherwatcher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.pashaandreyev.classesset.WeatherData;
import com.pashaandreyev.classesset.WeatherDataBuilder;


public class MainActivity extends AppCompatActivity {

    WeatherData mWeatherData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WeatherDataBuilder weatherDataBuilder = new WeatherDataBuilder();
        mWeatherData = weatherDataBuilder.build();
    }
}
