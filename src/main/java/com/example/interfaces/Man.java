package com.example.interfaces;

public class Man implements Comparable<Man> {
    private int id;
    private String name;

    public Man(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Man m) {
        if (this.id - m.id < 0) {
            return -1;
        } else if (this.id - m.id == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}
