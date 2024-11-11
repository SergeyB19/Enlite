package com.example.Leetcode;

import java.util.*;

public class PalindromeSolution {
    public static void main(String[] args) {
        isPalindrome(121);
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String s = x + " ";
        StringBuilder sb = new StringBuilder(s);
        boolean equalsResult = sb.reverse().toString().equals(s);
        System.out.println(equalsResult);
        return equalsResult;

    }
}
