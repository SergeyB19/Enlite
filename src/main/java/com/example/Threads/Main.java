package com.example.Threads;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World" + " " + Thread.currentThread().getName());
        MyThread myThread = new MyThread();
        myThread.start();

        MyThread myThread2 = new MyThread();
        myThread2.start();
        print();
    }

    public static void print() {
        System.out.println("Ok I print");
    }
}


class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello from MyThread"+ " " + Thread.currentThread().getName());
    }
}
