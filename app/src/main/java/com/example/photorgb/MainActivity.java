package com.example.photorgb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {


    SeekBar RedSB, GreenSB, BlueSB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RedSB = findViewById(R.id.seekBar1);
        GreenSB = findViewById(R.id.seekBar2);
        BlueSB = findViewById(R.id.seekBar3);
    }

    public void RGBchange(View view) {

    }
}