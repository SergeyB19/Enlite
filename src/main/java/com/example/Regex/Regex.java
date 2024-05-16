package com.example.Regex;

public class Regex {
    public static void main(String[] args) {
        String s = "JA!a";

        if (s.matches("J[a-zA-Z0-9].a")) {
            System.out.println("YES");

        } else {
            System.out.println("NO");
        }
    }
}
