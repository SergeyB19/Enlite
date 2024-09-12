package com.example.Generics;

public class GenericsExample {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        show(a,b);
        Long c = 3L;
        Long d = 4L;
        show(c,d);
        String s = "ABC";
        String t = "FCG";
        show(s,t);
    }

    public static <T> void show(T a, T b) {
        System.out.println(a + " " + b);
    }

}
