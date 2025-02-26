package com.sunbeam.exam_86991.activity;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.sunbeam.exam_86991.R;

public class DetailsActivity extends AppCompatActivity {
    TextView productId,productName,productCategory,productPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_details);

        productId =  findViewById(R.id.productId);
        productName =  findViewById(R.id.productName);
        productCategory =  findViewById(R.id.productCategory);
        productPrice =  findViewById(R.id.productPrice);





    }
}