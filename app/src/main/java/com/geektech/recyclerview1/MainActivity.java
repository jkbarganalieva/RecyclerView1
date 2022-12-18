package com.geektech.recyclerview1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView waterRecyclerView;
    private ArrayList<String> waterList=new ArrayList<>();
    private WaterAdapter waterAdapter =new WaterAdapter(waterList);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        waterRecyclerView=findViewById(R.id.recycler_view);
        loadData();
      waterRecyclerView.setAdapter(waterAdapter);
    }

    private void loadData() {
        waterList.add("Легенда");
        waterList.add("Жалал-Абад");
        waterList.add("Байтик");
        waterList.add("Боржоми");
        waterList.add("Ысык-Ата");
        waterList.add("Жалал-Абад 27");
        waterList.add("Кара-Шоро");
        waterList.add("Асу");
        waterList.add("Ключевая");
        waterList.add("Арашан");
        waterList.add("Тянь-Шань Легенда");
    }
}