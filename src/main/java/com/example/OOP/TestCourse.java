package com.example.OOP;

public class TestCourse {
    public static void main(String[] args) {
        Course maths = new Course("Mathematics");
        maths.addStudent("Jack");
        maths.addStudent("John");
        maths.addStudent("Alise");

        Course physics = new Course("Physics");
        physics.addStudent("Adam");
        physics.addStudent("Anton");

        System.out.println(maths.getCourse_name());
        for (int i = 0; i < maths.getStudent_count(); i++) {
            System.out.println((i + 1) + " " + maths.getStudents()[i]);

        }
        System.out.println();
        System.out.println(physics.getCourse_name());
        for (int i = 0; i < physics.getStudent_count(); i++) {
            System.out.println((i + 1) + " " + physics.getStudents()[i]);

        }
    }
}
