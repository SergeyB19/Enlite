package com.example.Leetcode;

public class SolutionReverse {
    public static void main(String[] args) {
        System.out.println(reverse(-234));
    }

    public static int reverse(int x) {
        int sign = 1;
        if (x < 0) {
            x *= -1;
            sign = -1;
        }
        int result = 0;
        int max = Integer.MAX_VALUE;
        while (x > 0) {
            int mod = x % 10;
            if (max / 10 > result || max / 10 == result && max % 10 > mod) {
                result = result * 10 + mod;
            } else return 0;
            x = x / 10;


        }
        return result * sign;
    }
}
