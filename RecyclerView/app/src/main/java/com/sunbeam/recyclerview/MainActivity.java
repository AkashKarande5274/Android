package com.sunbeam.recyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    List<String> countrieslist;

    CountryAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        countrieslist = new ArrayList<>();
        Collections.addAll(countrieslist,"India","Africa","USA","Europe","Japan");

        adapter = new CountryAdapter(this,countrieslist);
       recyclerView.setAdapter(adapter);

       recyclerView.setLayoutManager(new GridLayoutManager(this,1));


    }



}