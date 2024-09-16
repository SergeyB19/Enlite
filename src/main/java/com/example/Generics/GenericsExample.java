package com.example.Generics;

public class GenericsExample {
    public static void main(String[] args) {
        Integer a = 1;
        Double b = 2.2;
        show(a, b);
        Long c = 3L;
        Long d = 4L;
        show(c, d);
        String s = "ABC";
        String t = "FCG";
        show(s, t);
    }

    public static <T, U> void show(T a, U b) {
        System.out.println(a + " " + b);
    }

}
