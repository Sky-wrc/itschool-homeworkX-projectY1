package com.example.rgb_palitra;

import java.lang.Object;
import java.lang.Comparable;
import java.lang.Enum;
import android.os.Bundle;
import android.graphics.Color;
import android.widget.Button;
import android.widget.FrameLayout;
import android.view.View;
import android.content.Intent;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ColorActivity extends AppCompatActivity {

    FrameLayout color;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_color);

        Button button = findViewById(R.id.button4);
        FrameLayout colour = findViewById(R.id.layout);



        Intent intent = getIntent();
        int red = intent.getIntExtra("KEY_INT1", 0);
        int green = intent.getIntExtra("KEY_INT2", 255);
        int blue = intent.getIntExtra("KEY_INT3", 255);
        button.setText(" \uD83D\uDD19 "+"RGB("+String.valueOf(red)+","+String.valueOf(green)+","+String.valueOf(blue)+")");

        //button.setBackgroundColor(Color.GREEN);
        colour.setBackgroundColor(Color.rgb(red, green, blue));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}