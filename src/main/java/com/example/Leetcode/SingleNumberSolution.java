package com.example.Leetcode;

public class SingleNumberSolution {
    public static void main(String[] args) {
//        singleNumber(new int[]{2,2,3,2});
        singleNumber(new int[]{0,1,0,1,0,1,99});
    }

    public static int singleNumber(int[] nums) {
        int count[] = new int[32];
        for (int x : nums) {
            for (int i = 0; i < 32; i++) {
                if ((x & 1) == 1) {
                    count[i]++;
                    x >>= 1; // x = x / 2;

                }
            }
        }
        int result = 0;
        for (int i = 0; i < 32; i++) {
            if (count[i] % 3 != 0) {
                result += (1 << i);
            }
        }
        System.out.println(result);
        return result;
    }
}
