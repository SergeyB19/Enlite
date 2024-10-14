package com.example.Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeTask {
    public static void main(String[] args) {
        Deque<Integer> deque_list = new LinkedList<>();
        Deque<Integer> deque_array = new ArrayDeque<>();

        deque_array.add(1);
        deque_array.addFirst(0);
        deque_array.addLast(12);

        while (!deque_array.isEmpty())
            System.out.print(deque_array.poll() + " ");
            System.out.println();

            deque_list.add(1);
            deque_list.addFirst(0);
            deque_list.addLast(12);

            while (!deque_list.isEmpty()) {
                System.out.print(deque_list.poll() + " ");
            }
        }
    }

