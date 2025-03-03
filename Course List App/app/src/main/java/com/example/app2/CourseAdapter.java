package com.example.app2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.MyViewHolder> {

    Context context;
    List<Course> courseList;

    public CourseAdapter(Context context, List<Course> courseList) {
        this.context = context;
        this.courseList = courseList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.listcourses2,null);
        return  new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Course c = courseList.get(position);
        holder.textCourseName.setText(c.getCourseName());
        holder.textCourseFees.setText(""+ c.getCourseFees());
        holder.courseImage.setImageResource(c.getImage());
    }

    @Override
    public int getItemCount() {
        return courseList.size();
    }

    class  MyViewHolder extends RecyclerView.ViewHolder {

        TextView textCourseName,textCourseFees;
        ImageView courseImage;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textCourseName = itemView.findViewById(R.id.textCourseName);
            textCourseFees = itemView.findViewById(R.id.textCourseFees);
            courseImage = itemView.findViewById(R.id.courseImage);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context,CourseDetailsActivity.class);
                    intent.putExtra("course",courseList.get(getAdapterPosition()));
                    context.startActivity(intent);


                }
            });
        }
    }
}
