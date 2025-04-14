package com.example.Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main5 {
    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newFixedThreadPool(5);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 20; i++) {
            executorService.execute(new MyThreadClass("A"));
            executorService.execute(new MyThreadClass("B"));
            executorService.execute(new MyThreadClass("C"));
            executorService.execute(new MyThreadClass("D"));
            executorService.execute(new MyThreadClass("E"));
        }
        executorService.shutdown();

    }
}

class MyThreadClass extends Thread {
    String name;

    public MyThreadClass(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + name);
        }
    }
}
