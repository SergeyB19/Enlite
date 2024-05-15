package com.example.OOP.ToString;

public class Example {
    String name;
    int id;

    public Example(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String toString() {
        return name + " " + id;
    }
}
