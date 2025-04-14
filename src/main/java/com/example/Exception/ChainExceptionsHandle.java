package com.example.Exception;

import java.io.IOException;

public class ChainExceptionsHandle {
    public static void main(String[] args) {
        try {
            method1();
            System.out.println("After method1");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException is caught");
        }
    }

    private static void method1() {
        try {
            method2();
            System.out.println("After method2");
        } catch (ArithmeticException ex) {
            System.out.println("ArithmeticException from method1 is called");
        }
    }

    private static void method2() throws ArithmeticException {
        throw new ArithmeticException();
    }
}
