package com.sunbeam.fragmentapp1.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sunbeam.fragmentapp1.R;
import com.sunbeam.fragmentapp1.adapter.CountryAdapter;
import com.sunbeam.fragmentapp1.adapter.FragmentAdapter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Countriesfragment extends Fragment {

    RecyclerView recyclerView;

    List<String> countries;


    CountryAdapter adapter;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        countries = new ArrayList<>();
        Collections.addAll(countries,"India","USA","UK","China","Japan");
        adapter = new CountryAdapter(getContext(),countries);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_countriesfragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),1));
    }
}