package com.example.Recursion;

public class Practice2 {
    public static void main(String[] args) {
        String s = "apple";

        System.out.println(reverse(s));
    }

    private static String reverse(String s) {
        if (s.length() == 1) {
            return s;
        }
        return "" + s.charAt(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
    }
}
