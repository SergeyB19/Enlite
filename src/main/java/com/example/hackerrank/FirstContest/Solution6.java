package com.example.hackerrank.FirstContest;

import java.util.Scanner;

public class Solution6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int aa = a + b;
        int bb = c + a;
        int cc = a + b + c;

        System.out.println("aa = " + aa);
        System.out.println("bb = " + bb);
        System.out.println("cc = " + cc);
    }
}
