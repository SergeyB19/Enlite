package com.example.Generics;

public class GenericsExample1 {
    public static void main(String[] args) {
        Person<Integer> p = new Person<>(5, 6);
        System.out.println(p.getA());
        System.out.println(p.getB());



        /*Person<Integer> p = new Person<>();
        p.show(1, 2);

        Person<Double> p2 = new Person<>();
        p2.show(3.1, 4.5);*/
    }
}

class Person<T> {
    T a;
    T b;

    public Person() {
    }

    public Person(T a, T b) {
        this.a = a;
        this.b = b;
    }

    public void show(T a, T b) {
        System.out.println(a + " " + b);
    }

    public T getA() {
        return a;
    }

    public T getB() {
        return b;
    }
}
