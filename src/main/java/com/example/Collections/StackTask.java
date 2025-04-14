package com.example.Collections;

import java.util.Stack;

public class StackTask {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.peek() + " ");
        System.out.println();
        while (!stack.isEmpty()) {
            System.out.println(stack.pop() + " ");
        }
    }
}
