package com.example.Regex;

public class Regex {
    public static void main(String[] args) {
        String s = "5Javaw";
        if (s.matches(".+Java.+")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
