package com.example.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class AnimationImg extends AppCompatActivity {

    ImageView img;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_img);

        img = findViewById(R.id.imageViewww);
        btn = findViewById(R.id.btnanim);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                YoYo.with(Techniques.BounceInDown).duration(7000).repeat(0).playOn(img);
            }
        });
    }
}