package com.example.Exception;

import java.io.IOException;

public class Rethrow {
    public static void main(String[] args)  {
        try {
            div(4, 0);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException is caught again");
        }
    }

    public static void div(int a, int b) throws ArithmeticException {

        try {
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException is caught");
            throw e;
        }
    }

}
