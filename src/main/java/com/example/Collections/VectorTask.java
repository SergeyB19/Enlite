package com.example.Collections;

import java.util.Vector;

public class VectorTask {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(10);
        vector.add(26);
        vector.add(5);
        vector.remove(2);
        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.get(i));
        }
        System.out.println();
        for (Integer i : vector) {
            System.out.println(i);
        }

    }
}
