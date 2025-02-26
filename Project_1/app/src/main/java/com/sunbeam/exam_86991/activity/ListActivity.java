package com.sunbeam.exam_86991.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.sunbeam.exam_86991.R;
import com.sunbeam.exam_86991.adapter.ProductAdapter;
import com.sunbeam.exam_86991.dbhelper.ProductDbHelper;
import com.sunbeam.exam_86991.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity  {
    RecyclerView recyclerlist;

    ImageButton imageButton;
    ProductAdapter adapter;

    List<Product> productlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_list);

        recyclerlist = findViewById(R.id.recyclerlist);
        imageButton = findViewById(R.id.imgadd);

        productlist = new ArrayList<>();
        productlist.add(new Product(1,"Samsung","Fridge",75000));
        productlist.add(new Product(2,"Honda","Bike",100000));
        productlist.add(new Product(3,"Lenovo","Laptop",45000));

        adapter = new ProductAdapter(this,productlist);
        recyclerlist.setAdapter(adapter);
        recyclerlist.setLayoutManager(new GridLayoutManager(this,1));



        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                add();
            }
        });



    }



    public  void  add(){
        Intent intent  = new Intent(this, AddActivity.class);
        startActivity(intent);
    }


public void  delete(){
    ProductDbHelper dbHelper = new ProductDbHelper();
    dbHelper.deleteProduct();
}



}