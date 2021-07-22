package com.example.android.myapplication.Taosty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.android.myapplication.R;
import com.google.android.material.snackbar.Snackbar;

public class SnackBar extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack_bar);
        Button bnt1 = findViewById(R.id.button);
        TextView tv1 = findViewById(R.id.textView);


    }
        /*  Ulternative of toast */

    public void bt1(View view) {
        Snackbar.make(view, "Clicked on button!", Snackbar.LENGTH_SHORT).show();



    }

    public void tv1(View view) {
        Snackbar.make(view, " Please check ur internet connection", Snackbar.LENGTH_SHORT).setAction("retry", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, " Internet Available!", Snackbar.LENGTH_SHORT).show();

            }
        }).show();

    }


}