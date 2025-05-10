package com.example.Training.idea;

import java.util.Arrays;
import java.util.Scanner;

public class SumArr {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            tmp += arr[i];
        }
        System.out.println(tmp);

    }
}
