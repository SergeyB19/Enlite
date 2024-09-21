package com.example.Generics;

public class GenericsExample4 {
    public static void main(String[] args) {
        Person1 p = new Person1();
        show(p);

    }

    public static <T extends Comparable<T> & Cloneable> void show(T a) {

    }
}

class Person1 implements Comparable<Person1>,Cloneable {

    @Override
    public int compareTo(Person1 o) {
        return 0;
    }
}
