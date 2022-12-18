package com.geektech.recyclerview1;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class WaterViewHolder extends RecyclerView.ViewHolder {

    private TextView tvWater;

    public WaterViewHolder(@NonNull View itemView) {
        super(itemView);
        tvWater = itemView.findViewById(R.id.tv_water);


    }

    public void bind(String water) {
        tvWater.setText(water);
    }
}
