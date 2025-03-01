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
import com.sunbeam.fragmentapp1.adapter.EmployeeAdapter;
import com.sunbeam.fragmentapp1.entity.Employee;

import java.util.ArrayList;
import java.util.List;


public class EmployeeFragment extends Fragment {

    RecyclerView recyclerView;
    List<Employee> employeeList;

    EmployeeAdapter adapter;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        employeeList = new ArrayList<>();
        employeeList.add(new Employee(1,"Anil",10000));
        employeeList.add(new Employee(2,"Mukesh",20000));
        employeeList.add(new Employee(3,"Ramesh",30000));
        employeeList.add(new Employee(4,"Suresh",40000));

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_employee, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),1));
    }
}