package com.example.rgb_palitra;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.SeekBar;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

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
    Button layoutChange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        redBar = findViewById(R.id.seekBar11);
        redBar.setMax(255);
        redBar.setProgress(255);
        greenBar = findViewById(R.id.seekBar8);
        greenBar.setMax(255);
        greenBar.setProgress(255);
        blueBar = findViewById(R.id.seekBar2);
        blueBar.setMax(255);
        blueBar.setProgress(255);
        red = findViewById(R.id.textView8);
        red.setTextColor(Color.RED);
        green = findViewById(R.id.textView7);
        green.setTextColor(Color.GREEN);
        blue = findViewById(R.id.textView6);
        blue.setTextColor(Color.BLUE);


        layoutChange = findViewById(R.id.button);


        layoutChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ColorActivity.class);
                intent.putExtra("KEY_INT1", redBar.getProgress());
                intent.putExtra("KEY_INT2", greenBar.getProgress());
                intent.putExtra("KEY_INT3", blueBar.getProgress());
                startActivity(intent);
            }
        });



        red.setText(String.valueOf(redBar.getProgress()));
        redBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                red.setText(String.valueOf(progress));
                red.setTextColor(Color.rgb(progress, 0, 0));
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
                green.setTextColor(Color.rgb(0, progress, 0));
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
                blue.setTextColor(Color.rgb(0, 0, progress));
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