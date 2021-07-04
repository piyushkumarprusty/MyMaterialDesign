package com.example.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import es.dmoral.toasty.Toasty;

public class ToastyUse extends AppCompatActivity implements View.OnClickListener {
    Button btn1, btn2, btn3, btn4, btn5, btn6;


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

//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toasty.success(ToastyUse.this, "Success!", Toasty.LENGTH_SHORT, true).show();
//            }
//        });
//        btn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toasty.success(ToastyUse.this, "There some Error!", Toasty.LENGTH_SHORT, true).show();
//            }
//        });
//        btn3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toasty.success(ToastyUse.this, " Its Normal!", Toasty.LENGTH_SHORT, true).show();
//            }
//        });
//        btn4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toasty.success(ToastyUse.this, "Blast warning!", Toasty.LENGTH_SHORT, true).show();
//            }
//        });
//        btn5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toasty.success(ToastyUse.this, "Got Info!", Toasty.LENGTH_SHORT, true).show();
//            }
//        });
//        btn6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toasty.success(ToastyUse.this, "Here Details!", Toasty.LENGTH_SHORT, true).show();
//            }
//        });

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.button2:
                Toasty.success(ToastyUse.this, "Success!", Toasty.LENGTH_SHORT, true).show();

                break;
            case R.id.button3:
                Toasty.success(ToastyUse.this, "There some Error!", Toasty.LENGTH_SHORT, true).show();

                break;
            case R.id.button4:
                Toasty.success(ToastyUse.this, " Its Normal!", Toasty.LENGTH_SHORT, true).show();

                break;
            case R.id.button5:
                Toasty.success(ToastyUse.this, "Blast warning!", Toasty.LENGTH_SHORT, true).show();

                break;
            case R.id.button6:
                Toasty.success(ToastyUse.this, "Got Info!", Toasty.LENGTH_SHORT, true).show();

                break;
            case R.id.button7:
                Toasty.success(ToastyUse.this, "Here Details!", Toasty.LENGTH_SHORT, true).show();

                break;


        }
    }
}