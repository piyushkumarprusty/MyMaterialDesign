package com.example.android.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


//    Spinner spinner;
//    TextView textView;
//    String country [] = { "India" , "Pakistan" , "USA" , "UAE" , "Dubai" , "Africa"};

    private ListView listView;
   // private List<Data> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listv);

        List<Data> list = new ArrayList<>();

        Data dat = new Data("ind", R.drawable.kk);
        list.add(dat);

        //or
        list.add(new Data("pak",R.drawable.kk));
        list.add(new Data("Tas",R.drawable.kk));
        list.add(new Data("Das",R.drawable.kk));
        list.add(new Data("Usa",R.drawable.kk));
        list.add(new Data("JAp",R.drawable.kk));
        list.add(new Data("KAp",R.drawable.kk));
        list.add(new Data("Vap",R.drawable.kk));
        list.add(new Data("Lap",R.drawable.kk));
        list.add(new Data("pak",R.drawable.kk));
        list.add(new Data("Opp",R.drawable.kk));
        list.add(new Data("pak",R.drawable.kk));
        list.add(new Data("Dop",R.drawable.kk));


        MyAdapater myAdapater =  new MyAdapater(this,R.layout.item, list);
        listView.setAdapter(myAdapater);

    }



    public class MyAdapater extends ArrayAdapter<Data>{

        List<Data> list;
        Context context;

        public MyAdapater(@NonNull Context context, int resource , List<Data> list) {
            super(context, resource , list);
            this.context=context;
            this.list=list;
        }

        @Override
        public int getCount() {
            return super.getCount();
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
            TextView tv = convertView.findViewById(R.id.tv);
            ImageView im = convertView.findViewById(R.id.iv);
            tv.setText(list.get(position).getName());
            im.setImageResource(list.get(position).getImage());


            return convertView ;
        }
    }






}


/*  Part one Spinner */

/*
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
        });*/