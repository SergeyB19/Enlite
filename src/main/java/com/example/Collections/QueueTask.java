package com.example.Collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTask {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }

    }
}
