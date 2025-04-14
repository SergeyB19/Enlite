package com.example.OOP.Composition_Aggregation;

public class App {
    public static void main(String[] args) {
        Heart heart = new Heart();
        Human human = new Human(heart);
        human.getHeart().pounding();
    }
}
