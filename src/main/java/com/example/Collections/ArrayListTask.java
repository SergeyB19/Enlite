package com.example.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTask {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(7);
        list.add(5);

        list.remove(2);
        System.out.println(list.contains(10));

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        for (Integer i : list) {
            System.out.print(i + " ");
        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
