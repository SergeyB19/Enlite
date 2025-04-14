package com.example.Leetcode;

public class SingleNumber {


    public static void main(String[] args) {

        singleNumber(new int[]{2, 2, 1});

    }

    public static int singleNumber(int[] nums) {
        int xor = 0;
        for (int x : nums) {
            xor ^= x;
        }
        System.out.println(xor);
        return xor;
    }


}
