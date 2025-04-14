package com.example.Threads;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();

        Thread t1 = new Thread(myThread);
        t1.start();
//        Thread.sleep(1000);

        Thread t2 = new Thread(myThread);
        t2.start();
        Thread.sleep(1000);

        System.out.println(myThread.getX());


        /*System.out.println("Hello World" + " " + Thread.currentThread().getName());
        MyThread myThread = new MyThread();
        myThread.start();

        myThread.join();

//        Thread.sleep(1000);

        MyThread myThread2 = new MyThread();
        myThread2.start();
        print();


        Thread t2 = new Thread(new MyThreadRunnable());
        t2.start();

        System.out.println("Main thread is dead");*/
    }

    /*public static void print() {
        System.out.println("Ok I print");
    }*/
}


class MyThread extends Thread {
    int x = 0;
    @Override
    public synchronized void run() {
        for (int i = 0; i < 10000; i++) {
            int temp = x;
            temp++;
            x = temp;

          /*  System.out.println(i + " Hello from MyThread"+ " " + Thread.currentThread().getName());
            Thread.yield();*/
        }
    }

    public int getX() {
        return x;
    }
}


/*
class MyThreadRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <100; i++) {

            System.out.println(i+" Hello from Runnable Thread"+ " " + Thread.currentThread().getName());
        }

    }
}
*/
