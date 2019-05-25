package com.example.final_progect;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private SeekBar massCraft;
    private SeekBar massFuel;
    private SeekBar hight;
    private SeekBar angle;
    private SeekBar speed_landing;
    private TextView mass_craft;
    private TextView mass_fuel;
    private TextView angleText;
    private TextView hightText;
    private TextView speedText;
    private Button finish;





    private HashMap<SeekBar, TextView> list = new HashMap<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        finish = (Button) findViewById(R.id.button);

        mass_craft = (TextView) findViewById(R.id.Mass_craft);
        mass_craft.setText("Mass of craft");
        mass_fuel = (TextView) findViewById(R.id.Mass_fuel);
        mass_fuel.setText("Mass of fuel");
        angleText = (TextView) findViewById(R.id.AngleLanding);
        angleText.setText("Angle of landing");
        hightText = (TextView) findViewById(R.id.Hight);
        hightText.setText("Hight");
        speedText = (TextView) findViewById(R.id.Speed);
        speedText.setText("Speed of lending");

        massCraft = (SeekBar) findViewById(R.id.MassofCraft);
        massFuel = (SeekBar) findViewById(R.id.MassofFuel);
        hight = (SeekBar) findViewById(R.id.HightofLanding);
        angle = (SeekBar) findViewById(R.id.AngleofLanding);
        speed_landing = (SeekBar) findViewById(R.id.Speedoflanding);

        list.put(massCraft, mass_craft);
        list.put(massFuel, mass_fuel);
        list.put(hight, hightText);
        list.put(angle, angleText);
        list.put(speed_landing, speedText);

        massCraft.setOnSeekBarChangeListener(seekBarChangeListener);
        massFuel.setOnSeekBarChangeListener(seekBarChangeListener);
        hight.setOnSeekBarChangeListener(seekBarChangeListener);
        angle.setOnSeekBarChangeListener(seekBarChangeListener);
        speed_landing.setOnSeekBarChangeListener(seekBarChangeListener);

        final Intent intent = new Intent(this, SpeedReading.class);

        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("massC", mass_craft.getText());
                intent.putExtra("massF", mass_fuel.getText());
                intent.putExtra("ang", angleText.getText());
                intent.putExtra("h", hightText.getText());
                intent.putExtra("v", speedText.getText());
                startActivity(intent);
            }
        });
    }

    private SeekBar.OnSeekBarChangeListener seekBarChangeListener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            list.get(seekBar).setText(""+seekBar.getProgress());
        }
        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
        }
        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            list.get(seekBar).setText(""+seekBar.getProgress());
        }

    };

}


