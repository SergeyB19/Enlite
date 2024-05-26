package com.example.inheritance;

public class TestInheritance {
    public static void main(String[] args) {
        Jack jack = new Jack("Jack", "Dawson", 21);
        System.out.println(jack.getName() + " " + jack.getSurname() + " " + jack.getAge());
        System.out.println(jack.nationality + " " + jack.residence);
        System.out.println(jack.toString());
        System.out.println(jack.parentToString());
    }
}
