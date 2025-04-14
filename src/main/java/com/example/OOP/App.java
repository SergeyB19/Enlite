package com.example.OOP;

public class App {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setAge(18);
        s1.setName("John");
        s1.setSurname("Doe");
        s1.setWeight(70);
        System.out.println(s1.getName() + " " + s1.getSurname() + " " + s1.getAge() + " " + " " + s1.getWeight());

        Student s2 = new Student();
        s2.setAge(17);
        s2.setName("Jack");
        s2.setSurname("Dawson");
        s2.setWeight(75);
        System.out.println(s2.getName() + " " + s2.getSurname() + " " + s2.getAge() + " " + " " + s2.getWeight());
    }
}
