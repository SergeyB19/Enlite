package com.example.hackerrank.FirstContest;

import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        float pi = (float) Math.PI;
        double L = (2 * pi * r) * 100 / 100;
        double S = pi * r * r;
        System.out.println("L = " + (float) L);
        System.out.println("S = " + (float) S);


    }
}
