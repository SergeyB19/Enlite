package com.example.Leetcode;

public class PowerOfTwoSecondExample {
    public static void main(String[] args) {
        isPowerOfTwo(1);
        isPowerOfTwo(16);
        isPowerOfTwo(3);

    }

    private static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        System.out.println((n & (n - 1)) == 0);
        return (n & (n - 1)) == 0;
    }
}
