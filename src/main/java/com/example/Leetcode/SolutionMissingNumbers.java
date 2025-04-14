package com.example.Leetcode;

public class SolutionMissingNumbers {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{3, 0, 1}));
        System.out.println(missingNumber(new int[]{0, 1}));
        System.out.println(missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int result = 0;
        for (int i = 0; i < n; i++) {
            result ^= nums[i] ^ i;
        }
        result ^= n;
        return result;
    }
}
