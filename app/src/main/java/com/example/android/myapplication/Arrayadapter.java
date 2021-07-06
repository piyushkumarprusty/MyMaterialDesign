package com.example.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Arrayadapter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arrayadapter);

        ListView listView = findViewById(R.id.myListView);
         ArrayList<String> market = new ArrayList<>();
        market.add("veg");
        market.add("veg");
        market.add("veg");
        market.add("veg");
        market.add("veg");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,market);

    }
}