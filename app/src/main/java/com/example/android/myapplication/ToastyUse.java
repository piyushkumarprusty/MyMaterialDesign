package com.example.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import es.dmoral.toasty.Toasty;

public class ToastyUse extends AppCompatActivity {
Button btn1,btn2,btn3,btn4,btn5,btn6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toasty_use);

        btn1 = findViewById(R.id.button2);
        btn2 = findViewById(R.id.button3);
        btn3 = findViewById(R.id.button4);
        btn4 = findViewById(R.id.button5);
        btn5 = findViewById(R.id.button6);
        btn6 = findViewById(R.id.button7);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toasty.success(ToastyUse.this , "Success!" , Toasty.LENGTH_SHORT,true).show();
            }
        });
    }
}