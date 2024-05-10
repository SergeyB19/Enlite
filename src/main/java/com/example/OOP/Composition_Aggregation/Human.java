package com.example.OOP.Composition_Aggregation;

public class Human {
    private final Heart heart;

    public Human(Heart heart) {
        this.heart = heart;
    }

    public Heart getHeart() {
        return heart;

    }
}
