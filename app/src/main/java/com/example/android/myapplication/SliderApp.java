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
        //getActionBar().hide();
       // ().getActionBar().hide();

        int imgarray[] = {R.drawable.pic17, R.drawable.pic7, R.drawable.pic6};

        flipper = findViewById(R.id.flipper);
        for (int i = 0; i < imgarray.length; i++) {
            showImage(imgarray[i]);
        }

    }

    public void showImage(int img) {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(img);
        flipper.addView(imageView);
        flipper.setFlipInterval(2000);
        flipper.setAutoStart(true);

        flipper.setInAnimation(this, android.R.anim.slide_in_left);
        flipper.setOutAnimation(this, android.R.anim.slide_out_right);

    }


}
