package com.example.OOP;

public class Course {
    private String course_name;
    private String[] students = new String[100];
    private int student_count = 0;

    public Course(String course_name) {
        this.course_name = course_name;
    }

    public void addStudent(String student) {
        students[student_count] = student;
        student_count++;
    }

    public int getStudent_count() {
        return student_count;
    }

    public String getCourse_name() {
        return course_name;
    }

    public String[] getStudents() {
        return students;
    }
}
