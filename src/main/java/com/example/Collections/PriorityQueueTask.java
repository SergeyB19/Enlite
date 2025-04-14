package com.example.Collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTask {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        queue.add(5);
        queue.add(1);
        queue.add(3);
        queue.add(2);

        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
    }
}
