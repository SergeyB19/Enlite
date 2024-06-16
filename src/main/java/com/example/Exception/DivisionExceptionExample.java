package com.example.Exception;

import java.util.Scanner;

public class DivisionExceptionExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            int a = in.nextInt();
            int b = in.nextInt();

            try {
                int diff = a / b;
                System.out.println("diff = " + diff);
            } catch (ArithmeticException e) {
                System.out.println("You are trying to divide by zero. Please enter new numbers");
            }
        }
    }
}
