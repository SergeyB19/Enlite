package com.example.Вызов_метода_и_тип_возврата;

public class Practice {
    public static void main(String[] args) {
        int x = sum(5, 7);
        System.out.println(x);
        name("Name");
        System.out.println(max(5, 10));
        System.out.println(fullName("John", "Doe"));
    }

    public static String fullName(String name, String surname) {
        String fullName = "";
        fullName = name + " " + surname;
        return fullName;
    }

    public static int max(int a, int b) {
        int max = 0;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        return max;
    }

    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void name(String s) {
        System.out.println("Your name is " + s);
    }
}
