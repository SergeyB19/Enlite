package com.example.Leetcode;

public class SolutionZeros {
    public static void main(String[] args) {
        String s = "1101";
        String s1 = "111000";
        String s2 = "110100010";
        checkZeroOnes(s);
        checkZeroOnes(s1);
        checkZeroOnes(s2);
    }


    public static boolean checkZeroOnes(String s) {
        String[] ones = s.split("0");
        String[] zeros = s.split("1");

        int max_ones = 0;
        int max_zeros = 0;

        for (String temp : ones) {
            max_ones = Math.max(max_ones, temp.length());
        }
        for (String temp : zeros) {
            max_zeros = Math.max(max_zeros, temp.length());
        }
        System.out.println(max_ones > max_zeros);
        return max_ones > max_zeros;
    }
}
