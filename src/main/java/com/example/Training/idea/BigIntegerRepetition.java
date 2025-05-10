package com.example.Training.idea;

import com.example.Training.Big;

import java.math.BigInteger;
import java.util.Scanner;

class BigIntegerRepetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        BigInteger target = new BigInteger(input);
        System.out.println(factorialWhile(target));
    }

    public static BigInteger factorialWhile(BigInteger target) {
        BigInteger result = BigInteger.valueOf(1);
        int n = 1;
        while (result.compareTo(target) < 0) {
            n++;
            BigInteger big = BigInteger.valueOf(n);
            result = result.multiply(big);
        }
        return BigInteger.valueOf(n);
    }
}
