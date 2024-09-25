package com.example.Generics;

import java.util.ArrayList;

public class GenericsExample7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("ABC");
        String s = list.get(0);
        System.out.println(s);

        ArrayList<Integer> arrayList[] = (ArrayList<Integer>[]) new ArrayList[10];

    }

    public static <T extends Persons> void show(T t) {
//        T t = new T();
        T t2 = (T) new Object();

    }
}

class Persons<T> {
    //    static T t;
    static int x = 5;
    int y = 1;
    T t2;
}
