package com.example.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayVSLinkedTask {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 10_000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }


        long start = System.currentTimeMillis();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i);
        }
        long end = System.currentTimeMillis();

        System.out.println("Time taken for arrayList " + (end-start) + " ms");

        start = System.currentTimeMillis();
        /*for (int i = 0; i < linkedList.size(); i++) {
            linkedList.get(i);
        }*/
        /*Iterator<Integer> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }*/
        for (int x : linkedList) {

            end = System.currentTimeMillis();

        }
        System.out.println("Time taken for linkedList " + (end-start) + " ms");
    }

}
