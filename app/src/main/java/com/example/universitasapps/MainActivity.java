package com.example.universitasapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvuniv;
    private ArrayList<Universitas> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvuniv = findViewById(R.id.rv_univ);
        rvuniv.setHasFixedSize(true);

        list.addAll(UniversitasData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvuniv.setLayoutManager(new LinearLayoutManager(this));
        ListUniversitasAdapter listUniversitasAdapter = new ListUniversitasAdapter(list);
        rvuniv.setAdapter(listUniversitasAdapter);

    };
}