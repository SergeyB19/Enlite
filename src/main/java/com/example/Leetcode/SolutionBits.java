package com.example.Leetcode;

public class SolutionBits {
    public static void main(String[] args) {
        hammingWeight(0000000000010010101);
    }

    public static int hammingWeight(int n) {
        int result = 0;
        while (n != 0) {
            n = n & (n - 1);
            result++;
        }
        System.out.println(result);
        return result;
    }
}
