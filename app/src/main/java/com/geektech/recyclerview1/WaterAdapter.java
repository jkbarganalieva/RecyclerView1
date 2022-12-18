package com.geektech.recyclerview1;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class WaterAdapter extends RecyclerView.Adapter<WaterViewHolder> {

    private ArrayList<String> waterList;

    public WaterAdapter(ArrayList<String> waterList){
        this.waterList=waterList;
    }

    @NonNull
    @Override
    public WaterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new WaterViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_water,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull WaterViewHolder holder, int position) {

        holder.bind(waterList.get(position));
    }

    @Override
    public int getItemCount() {
        return waterList.size();
    }
}
