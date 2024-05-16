package com.example.Regex;

public class Regex {
    public static void main(String[] args) {
        String s = "J_!a";

        if (s.matches("J[\\w&&[^_]].a")) {
            System.out.println("YES");

        } else {
            System.out.println("NO");
        }
    }
}
