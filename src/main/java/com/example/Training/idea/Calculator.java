package com.example.Training.idea;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long first = scanner.nextLong();
        String operation = scanner.next();
        long second = scanner.nextLong();
        switch (operation) {
            case "+" -> System.out.println(first + second);
            case "-" -> System.out.println(first - second);
            case "*" -> System.out.println(first * second);
            case "/" -> {
                if (second == 0) {
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(first / second);
                }
            }
            default -> System.out.println("Unknown operator");
        }
    }
}
