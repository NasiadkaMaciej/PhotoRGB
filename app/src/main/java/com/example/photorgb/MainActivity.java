package com.example.photorgb;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    ImageView image;
    SeekBar WhiteSB, RedSB, GreenSB, BlueSB, HeightSB, WidthSB;
    int baseHeight = 200;
    int baseWidth = 300;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image = findViewById(R.id.imageView);
        WhiteSB = findViewById(R.id.seekBar1);
        RedSB = findViewById(R.id.seekBar2);
        GreenSB = findViewById(R.id.seekBar3);
        BlueSB = findViewById(R.id.seekBar4);
        HeightSB = findViewById(R.id.seekBar5);
        WidthSB = findViewById(R.id.seekBar6);

        WhiteSB.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                image.setColorFilter((Color.argb(WhiteSB.getProgress(), RedSB.getProgress(), GreenSB.getProgress(), BlueSB.getProgress())));
            }
        });
        RedSB.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                image.setColorFilter((Color.argb(WhiteSB.getProgress(), RedSB.getProgress(), GreenSB.getProgress(), BlueSB.getProgress())));
            }
        });
        GreenSB.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                image.setColorFilter((Color.argb(WhiteSB.getProgress(), RedSB.getProgress(), GreenSB.getProgress(), BlueSB.getProgress())));
            }
        });
        BlueSB.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                image.setColorFilter((Color.argb(WhiteSB.getProgress(), RedSB.getProgress(), GreenSB.getProgress(), BlueSB.getProgress())));
            }
        });
        HeightSB.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                image.setScaleY((float)HeightSB.getProgress()/100);
            }
        });
        WidthSB.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                image.setScaleX((float)WidthSB.getProgress()/100);
            }
        });
    }

    public void rotateL(View view) {
        image.setRotation(image.getRotation()-90);
    }
    public void rotateR(View view) {
        image.setRotation(image.getRotation()+90);
    }
}