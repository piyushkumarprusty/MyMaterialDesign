package com.example.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Spinner spinner;
    TextView textView;

    String country [] = { "India" , "Pakistan" , "USA" , "UAE" , "Dubai" , "Africa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner=findViewById(R.id.spinner);
        textView = findViewById(R.id.tvv);

        ArrayAdapter adp;
        adp = new ArrayAdapter(this, android.R.layout.simple_spinner_item,country);
        adp.setDropDownViewResource(android.R.layout.simple_list_item_multiple_choice);

        spinner.setAdapter(adp);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    textView.setText("");
                }
                else{
                    textView.setText(country[position]);
                    textView.setTextColor(Color.GREEN);
                    textView.setTextSize(25);

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}