package com.example.Generics;

import java.util.ArrayList;
import java.util.Date;

public class GenericsExample2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(123.6);
        list.add("ABC");
        list.add(new Date());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }
}
