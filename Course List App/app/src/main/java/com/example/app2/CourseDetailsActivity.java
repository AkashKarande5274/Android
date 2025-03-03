package com.example.app2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CourseDetailsActivity extends AppCompatActivity {
    TextView  courseId,courseName,courseDesc,courseEligibilty,courseFees;
    ImageView courseImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_details);
        courseImage = findViewById(R.id.courseImage);
        courseId = findViewById(R.id.textCourseId);
        courseName = findViewById(R.id.textCourseName);
        courseDesc = findViewById(R.id.textCourseDesc);
        courseEligibilty = findViewById(R.id.textCourseEligiblity);
        courseFees = findViewById(R.id.textCourseFees);




        Intent intent = getIntent();
        Course course = (Course) intent.getSerializableExtra("course");
        Log.e("onCreate: ", String.valueOf(course.getCourseId()));
        courseImage.setImageResource(course.getImage());
        courseId.setText(""+course.getCourseId());
        courseName.setText(course.getCourseName());
        courseDesc.setText(course.getCourseDesc());
        courseEligibilty.setText(course.getCourseEligibility());
        courseFees.setText(""+course.getCourseFees());





    }
}