package com.example.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class SliderApp extends AppCompatActivity {

    ViewFlipper flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider_app);

        int imgarray[] = {R.drawable.pic17, R.drawable.pic7, R.drawable.pic6};

        flipper = findViewById(R.id.flipper);

    }

    public void showImage(int img){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(img);
    }



}