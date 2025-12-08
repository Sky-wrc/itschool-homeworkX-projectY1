package com.example.rgb_palitra;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.SeekBar;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    SeekBar redBar;
    TextView red;
    SeekBar greenBar;
    TextView green;
    SeekBar blueBar;
    TextView blue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        redBar = findViewById(R.id.seekBar11);
        redBar.setMax(255);
        greenBar = findViewById(R.id.seekBar8);
        greenBar.setMax(255);
        blueBar = findViewById(R.id.seekBar2);
        blueBar.setMax(255);
        red = findViewById(R.id.textView8);
        green = findViewById(R.id.textView7);
        blue = findViewById(R.id.textView6);


        red.setText(String.valueOf(redBar.getProgress()));
        redBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                red.setText(String.valueOf(progress));
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
        green.setText(String.valueOf(greenBar.getProgress()));
        greenBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                green.setText(String.valueOf(progress));
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
        blue.setText(String.valueOf(blueBar.getProgress()));
        blueBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                blue.setText(String.valueOf(progress));
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });



    }
}