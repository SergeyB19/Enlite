package com.example.Training.idea.Logger;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine().toLowerCase(Locale.ROOT);
        HashMap<LogLevel, Integer> hashMap = new HashMap<LogLevel, Integer>();
        hashMap.put(LogLevel.SEVERE, 1000);
        hashMap.put(LogLevel.WARNING, 900);
        hashMap.put(LogLevel.INFO, 800);
        hashMap.put(LogLevel.CONFIG, 700);
        hashMap.put(LogLevel.FINE, 500);
        hashMap.put(LogLevel.FINER, 400);
        hashMap.put(LogLevel.FINEST, 300);

        String[] logLevels = a.split("\\s+");
        int totalValue = 0;
        for (String logLevel : logLevels) {
            switch (logLevel) {
                case "severe" -> totalValue += hashMap.get(LogLevel.SEVERE);
                case "warning" -> totalValue += hashMap.get(LogLevel.WARNING);
                case "info" -> totalValue += hashMap.get(LogLevel.INFO);
                case "config" -> totalValue += hashMap.get(LogLevel.CONFIG);
                case "fine" -> totalValue += hashMap.get(LogLevel.FINE);
                case "finer" -> totalValue += hashMap.get(LogLevel.FINER);
                case "finest" -> totalValue += hashMap.get(LogLevel.FINEST);
                default -> throw new RuntimeException();
            }
        }
        System.out.println(totalValue);
    }
}

enum LogLevel {
    SEVERE, WARNING, INFO, CONFIG, FINE, FINER, FINEST
}
