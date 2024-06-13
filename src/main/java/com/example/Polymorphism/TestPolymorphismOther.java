package com.example.Polymorphism;

public class TestPolymorphismOther {
    public static void main(String[] args) {
        Animal siyamskaya = new Siyamskaya();
        Animal alabay = new Alabay();

        siyamskaya.walk();
        alabay.walk();
    }
}
