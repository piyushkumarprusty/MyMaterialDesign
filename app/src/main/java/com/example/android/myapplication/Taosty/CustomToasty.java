package com.example.android.myapplication.Taosty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.myapplication.R;

import java.io.DataOutputStream;

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

//                v = getLayoutInflater().inflate(R.layout.customtoast,findViewById(R.id.viewHolder));
//                TextView tv = v.findViewById(R.id.t1);
//                tv.setText("custom Toast");
//                //Toast toast =new Toast(getApplicationContext() , v , Toast.LENGTH_LONG, Gravity.CENTER_VERTICAL).show();
//                Toast toast =new Toast(getApplicationContext());
//                toast.setView(v);
//                toast.setDuration(Toast.LENGTH_LONG);
//                toast.getGravity(Gravity.CENTER_VERTICAL, 0 , 0);

                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.customtoast,findViewById(R.id.viewHolder));
                TextView tv =layout.findViewById(R.id.t1);
                tv.setText("Custom Toast Demo");

                Toast toast = new Toast(getApplicationContext());
                toast.setView(layout);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
                toast.show();



            }
        });

    }
}