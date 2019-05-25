package com.example.final_progect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SpeedReading extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.speed_reading);
        Bundle arguments = getIntent().getExtras();

    }
}
