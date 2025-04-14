package com.example.Exception;

import java.io.IOException;
import java.util.Scanner;

public class DivisionExceptionExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            int a = in.nextInt();
            int b = in.nextInt();

            try {
                int div = divide(a, b);
                System.out.println("a / b = " + div);
                if (b == 0) throw new ArithmeticException();
                int diff = a / b;
                System.out.println("diff = " + diff);
            } catch (ArithmeticException e) {
                System.out.println("You are trying to divide by zero. Please enter new numbers");
            } catch (IOException ex2) {

            } catch (RuntimeException ex3) {

            }
        }
    }

    public static int divide(int a, int b) throws ArithmeticException, IOException {
        if (b == 0) throw new ArithmeticException();
        if (a == 1) {
            throw new IOException();
        }
        return a / b;
    }
}
