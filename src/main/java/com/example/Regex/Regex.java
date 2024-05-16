package com.example.Regex;

public class Regex {
    public static void main(String[] args) {
        String s = "Jqwa";

        if (s.matches("J..a")) {
            System.out.println("YES");

        } else {
            System.out.println("NO");
        }
        if (s.equals("Java")) {
            System.out.println("Equals");
        } else {
            System.out.println("Not Equals");
        }
    }
}
