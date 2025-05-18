package com.example.Training.idea;

import java.util.Scanner;

public class EMart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countMarts = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < countMarts; i++) {
            String martName = scanner.next();
            String closingTime = scanner.next();
            String[] timeParts = closingTime.split(":");
            int hours = Integer.parseInt(timeParts[0]);
            int minutes = Integer.parseInt(timeParts[1]);
            int currentTimeHours = 19;
            int currentTimeMinutes = 30;
            int travelTimeMinutes = 30;
            int totalTimeMinutes = (currentTimeHours * 60) + currentTimeMinutes + travelTimeMinutes;
            int closingTimeMinutes = (hours * 60) + minutes;
            if (closingTimeMinutes > totalTimeMinutes) {
                System.out.println(martName);
            }
        }
    }
}
