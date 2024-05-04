package com.example.Recursion;

public class Practice3 {
    public static void main(String[] args) {
        String s = "ABCBA";

        System.out.println(isPalindrome(s) ? "YES" : "NO");
    }

    private static boolean isPalindrome(String s) {
        if (s.length() == 1 || s.length() == 0) {
            return true;
        }

        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return isPalindrome(s.substring(1, s.length() - 1));

        }
        return false;
    }
}
