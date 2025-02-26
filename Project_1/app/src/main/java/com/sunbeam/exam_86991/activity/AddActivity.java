package com.sunbeam.exam_86991.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.sunbeam.exam_86991.R;
import com.sunbeam.exam_86991.dbhelper.ProductDbHelper;
import com.sunbeam.exam_86991.entity.Product;

public class AddActivity extends AppCompatActivity {

    EditText editId,editName,editCategory,editPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_add);

        editId = findViewById(R.id.editId);
        editName = findViewById(R.id.editName);
        editCategory = findViewById(R.id.editCategory);
        editPrice = findViewById(R.id.editPrice);




    }

    public void save(View view) {
        ProductDbHelper dbHelper = new ProductDbHelper(this);
        Product product = new Product(editId.getText(),editName.getText().toString(),editCategory.getText().toString(),editPrice.getText().toString());
        dbHelper.insertProduct(product);
    }

    public void cancel(View view) {


        finish();
    }
}