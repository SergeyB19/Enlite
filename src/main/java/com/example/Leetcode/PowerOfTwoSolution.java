package com.example.Leetcode;

public class PowerOfTwoSolution {
    public static void main(String[] args) {
        isPowerTwo(3);
        isPowerTwo2(3);
    }

    public static boolean isPowerTwo(int n) {
        if (n <= 0) {
            return false;
        }
        while (n > 1 && n % 2 == 0) {
            n /= 2;
        }
        System.out.println(n == 1 ? true : false);
        return n == 1 ? true : false;
    }

    public static boolean isPowerTwo2(int n) {
        if (n <= 0) {
            return false;
        }
        System.out.println((n & (n - 1)) == 0 ? true : false);
        return (n & (n - 1)) == 0 ? true : false;
    }
}
