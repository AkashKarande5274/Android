package com.example.app2;

import java.io.Serializable;

public class Course implements Serializable {
    private  int courseId;
    private String courseName;
    private String courseDesc;
    private String courseEligibility;
    private double courseFees;
    private int image;

    public Course(){

    }


    public Course(int courseId, String courseName, String courseDesc, String courseEligibility, double courseFees, int image) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDesc = courseDesc;
        this.courseEligibility = courseEligibility;
        this.courseFees = courseFees;
        this.image = image;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDesc() {
        return courseDesc;
    }

    public void setCourseDesc(String courseDesc) {
        this.courseDesc = courseDesc;
    }

    public String getCourseEligibility() {
        return courseEligibility;
    }

    public void setCourseEligibility(String courseEligibility) {
        this.courseEligibility = courseEligibility;
    }

    public double getCourseFees() {
        return courseFees;
    }

    public void setCourseFees(double courseFees) {
        this.courseFees = courseFees;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", courseDesc='" + courseDesc + '\'' +
                ", courseEligibility='" + courseEligibility + '\'' +
                ", courseFees=" + courseFees +
                ", image=" + image +
                '}';
    }
}
