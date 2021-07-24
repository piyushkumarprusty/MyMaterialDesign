package com.example.android.myapplication.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.example.android.myapplication.R;

public class RecyclerView extends AppCompatActivity {

    androidx.recyclerview.widget.RecyclerView rcv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        rcv =  findViewById(R.id.rcl);
        rcv.setLayoutManager(new LinearLayoutManager(this));


    }
}