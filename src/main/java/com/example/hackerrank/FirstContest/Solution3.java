package com.example.hackerrank.FirstContest;

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int result = (int) (Math.pow(x, 3) + 5 * x * y - 6 * z * y + Math.pow(z, 3));
        System.out.println("result = " + result);
    }
}
