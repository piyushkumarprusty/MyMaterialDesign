package com.example.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Glide_LibraryUse extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide_library_use);
        getSupportActionBar().hide();
        imageView = findViewById(R.id.imageViewg);

        Glide.with(this).load("https://unsplash.com/photos/aKbNRT-PKqQ").placeholder(R.drawable.kk).into(imageView);


    }
}