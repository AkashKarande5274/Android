package com.sunbeam.fragmentapp1.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.sunbeam.fragmentapp1.R;
import com.sunbeam.fragmentapp1.entity.Employee;

public class EmployeeDetailsActivity extends AppCompatActivity {

    TextView textId,textName,textSalary;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_employee_details);
        textId = findViewById(R.id.textId);
        textName = findViewById(R.id.textName);
        textSalary = findViewById(R.id.textSalary);

        Intent intent = getIntent();
        Employee employee = (Employee) intent.getSerializableExtra("employee");
        textId.setText("Id :"+ employee.getEmpid());
        textName.setText(employee.getName());
        textSalary.setText("Salary"+ employee.getSalary());

    }
}