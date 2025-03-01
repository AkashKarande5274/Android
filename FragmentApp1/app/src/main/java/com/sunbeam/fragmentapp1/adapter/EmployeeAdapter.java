package com.sunbeam.fragmentapp1.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sunbeam.fragmentapp1.R;
import com.sunbeam.fragmentapp1.entity.Employee;

import java.util.List;

public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeAdapter.MyViewHolder> {

    Context context;
    List<Employee> employeeList;

    public EmployeeAdapter(Context context, List<Employee> employeeList) {
        this.context = context;
        this.employeeList = employeeList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_employee,null);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.textId.setText("Id"+ employeeList.get(position).getEmpid());
        holder.textId.setText(employeeList.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return employeeList.size();
    }

    class  MyViewHolder extends RecyclerView.ViewHolder{

        TextView textId,textName,textSalary;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textId = itemView.findViewById(R.id.textId);
            textName = itemView.findViewById(R.id.textName);
            textSalary = itemView.findViewById(R.id.textSalary);

        }
    }
}
