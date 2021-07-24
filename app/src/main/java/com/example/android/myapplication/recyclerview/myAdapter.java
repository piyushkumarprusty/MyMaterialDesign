package com.example.android.myapplication.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android.myapplication.R;

public class myAdapter extends RecyclerView.Adapter<myAdapter.viewHolder> {

    String data[];

    public myAdapter(String[] data) {
        this.data = data;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.singlelayout, parent, false);
        View view1 = LayoutInflater.from(parent.getContext()).inflate(R.layout.singlelayout,parent,false);
        //View view = LayoutInflater.from(context).inflate(R.layout.sample_recyclarview , parent,false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myAdapter.viewHolder holder, int position) {
        holder.tv.setText(data[position]);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

//        @NonNull
//    @Override
//    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
//        return null;
//
//    }
//
//
//    @Override
//    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder , int position) {
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return 0;
//    }

    class viewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView tv;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.img11);
            tv = itemView.findViewById(R.id.t12);

        }
    }
}
