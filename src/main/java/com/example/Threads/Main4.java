package com.example.Threads;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main4 {
    static Account account = new Account();

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyDeposit());
        Thread t2 = new Thread(new MyWithdrawal());
        t1.start();
        t2.start();

    }
}

class MyDeposit extends Thread {
    public void run() {
        try {
            Main4.account.deposit(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class MyWithdrawal extends Thread {
    public void run() {
        try {
            Main4.account.withdraw(700);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Account {
    Lock lock = new ReentrantLock();
    Condition newCondition = lock.newCondition();

    int balance = 0;

    public void deposit(int amount) throws InterruptedException {
        lock.lock();
        Thread.sleep(1000);
        balance += amount;
        System.out.println("Balance is increased " + balance);
        newCondition.signalAll();
        lock.unlock();
    }

    public void withdraw(int amount) throws InterruptedException {
        lock.lock();
        while (amount > balance) {
            newCondition.await();
        }
        System.out.println("Balance before with drawal " + balance);
        balance -= amount;
        System.out.println("Balance after with drawal " + balance);
        lock.unlock();
    }
}
