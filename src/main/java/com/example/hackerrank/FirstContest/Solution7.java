package com.example.hackerrank.FirstContest;

import java.util.Scanner;

public class Solution7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n % 10 + (n / 10 % 10) + n / 100);
    }
}
