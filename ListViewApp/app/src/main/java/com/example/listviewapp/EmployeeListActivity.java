package com.example.listviewapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.PopupMenu;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class EmployeeListActivity extends AppCompatActivity {

    ListView listView;
    List<Employee> emplist;
    ArrayAdapter adapter;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_employee_list);
        listView = findViewById(R.id.listView);
        emplist = new ArrayList<>();
        emplist.add(new Employee(1,"Anil",10000));
        emplist.add(new Employee(2,"Mukush",20000));
        emplist.add(new Employee(3,"Ramesh",30000));
        emplist.add(new Employee(4,"Suresh",40000));
        emplist.add(new Employee(5,"Ram",50000));
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,emplist);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Employee e = emplist.get(position);
                Intent intent = new Intent(EmployeeListActivity.this,EmployeeDetailsActivity.class);
                intent.putExtra("employee",e);
                startActivity(intent);
            }
        });

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int position, long l) {
                PopupMenu popupMenu = new PopupMenu(EmployeeListActivity.this,view);
                popupMenu.getMenu().add("delete");
                popupMenu.show();

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                       emplist.remove(position);
                       adapter.notifyDataSetChanged();
                       return false;
                    }
                });
                return  false;
            }
        });



    }
}