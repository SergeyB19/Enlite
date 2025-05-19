package com.example.Training.idea;

import java.util.Scanner;

class Intersection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] timeRange1 = scanner.nextLine().split(" ");
        String[] timeRange2 = scanner.nextLine().split(" ");

        // Parse the input into hours and minutes
        String[] startTime1 = timeRange1[0].split(":");
        String[] endTime1 = timeRange1[1].split(":");
        String[] startTime2 = timeRange2[0].split(":");
        String[] endTime2 = timeRange2[1].split(":");

        // Calculate the total minutes for each time point
        int start1 = Integer.parseInt(startTime1[0]) * 60 + Integer.parseInt(startTime1[1]);
        int end1 = Integer.parseInt(endTime1[0]) * 60 + Integer.parseInt(endTime1[1]);
        int start2 = Integer.parseInt(startTime2[0]) * 60 + Integer.parseInt(startTime2[1]);
        int end2 = Integer.parseInt(endTime2[0]) * 60 + Integer.parseInt(endTime2[1]);

        System.out.println(isOverlapping(start1, end1, start2, end2));
    }

    // Modified isOverlapping method
    public static boolean isOverlapping(int start1, int end1, int start2, int end2) {
        return start1 <= end2 && start2 <= end1;
    }
}

