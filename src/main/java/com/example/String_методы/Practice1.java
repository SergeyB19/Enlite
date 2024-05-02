package com.example.String_методы;

public class Practice1 {
    public static void main(String[] args) {


        char c = 'a';
        System.out.println(c);
        System.out.println((int) c);

        String s = "Welcome to Java";
        String t = "Welcome to Java";

        if (s.equals(t)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        System.out.println(s.compareTo(t));
        if (s.compareTo(t) < 0) {
            System.out.println("<0");
        } else {
            System.out.println(">0");
        }

        System.out.println(s.startsWith("Welcome"));
        System.out.println(s.endsWith("Java"));
    }
}
