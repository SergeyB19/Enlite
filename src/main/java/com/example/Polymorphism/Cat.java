package com.example.Polymorphism;

public class Cat extends Animal {

    @Override
    public void walk() {
        System.out.println("Cat is walking");
    }

    public void cat_sound() {
        System.out.println("Meow");
    }
}
