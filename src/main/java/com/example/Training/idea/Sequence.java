package com.example.Training.idea;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int count = 1;
        int repeat = 1;
        int index = 0;
        int n = scanner.nextInt();
        while (n>0) {
            System.out.print(count + " ");

            n--;
            index++;
            if (index == repeat) {
                count++;
                index = 0;
                repeat = count;
            }
        }
    }
}
