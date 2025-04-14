package com.example.Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayVSLinkedTask2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 10_000_000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long start = System.currentTimeMillis();
        arrayList.remove(0);
        long end = System.currentTimeMillis();
        System.out.println("Time taken for ArrayList to remove element is " + (end - start) + "ms");

        start = System.currentTimeMillis();
        arrayList.remove(0);
        end = System.currentTimeMillis();
        System.out.println("Time taken for LinkedList to remove element is " + (end - start) + "ms");
    }
}
