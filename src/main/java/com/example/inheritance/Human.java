package com.example.inheritance;

public class Human {
    String nationality = "American";
    String residence = "USA";

    public Human() {
        System.out.println("Human is called");
    }

    public String getNationality() {
        return nationality;
    }

    public String getResidence() {
        return residence;
    }

    public void print() {
        System.out.println("Human in printing");
    }

    @Override
    public String toString() {
        return "Human{" +
                "nationality='" + nationality + '\'' +
                ", residence='" + residence + '\'' +
                '}';
    }
}
