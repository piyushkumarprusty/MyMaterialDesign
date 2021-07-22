package com.example.android.myapplication.Taosty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.android.myapplication.R;

public class CustomToasty extends AppCompatActivity {

    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_toasty);

        btn1 =findViewById(R.id.button8);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v = getLayoutInflater().inflate(R.layout.customtoast,findViewById(R.id.viewHolder));
                TextView tv = v.findViewById(R.id.t1);
                tv.setText("custom Toast");
            }
        });

    }
}