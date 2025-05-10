package com.example.Training.idea;

import java.util.Locale;

public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("aaaa"));
    }

    public static boolean isPalindrome(String str) {
        if (str == null || str.replaceAll("[a-zA-Z0-9]", "").equals(str)) {
            return false;
        }
        String clean = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(Locale.ROOT);
        int left = 0;
        int right = clean.length() - 1;
        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
