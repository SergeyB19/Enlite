package com.example.Recursion;

public class Practice4 {
    public static void main(String[] args) {
        System.out.println(fib(20));
    }

    private static int fib(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
