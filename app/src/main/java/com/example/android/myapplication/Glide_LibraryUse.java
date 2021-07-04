package com.example.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

public class Glide_LibraryUse extends AppCompatActivity {
    ImageView imageViewg ,  imageViewp  ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide_library_use);
        getSupportActionBar().hide();
        imageViewg = findViewById(R.id.imageViewg);
        imageViewp = findViewById(R.id.imageViewp);

        Glide.with(this).load("https://unsplash.com/photos/aKbNRT-PKqQ").placeholder(R.drawable.kk).into(imageViewg);
        Picasso.get().load("https://raw.githubusercontent.com/square/picasso/master/website/static/sample.png").into(imageViewp);

    }
}