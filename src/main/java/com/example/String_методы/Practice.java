package com.example.String_методы;

public class Practice {
    public static void main(String[] args) {
        String s = "Welcome to Java";
        String t = " OK";
        String e = " Good! ";
        String s1 = new String("Welcome");
        System.out.println("s.length() = " + s.length());
        System.out.println("s.charAt(3) = " + s.charAt(3));
        System.out.println("s.concat(t) = " + s.concat(t));
        System.out.println("s.toUpperCase() = " + s.toUpperCase());
        System.out.println("s.toLowerCase() = " + s.toLowerCase());
        System.out.println("e.trim() = " + e.trim());
    }
}
