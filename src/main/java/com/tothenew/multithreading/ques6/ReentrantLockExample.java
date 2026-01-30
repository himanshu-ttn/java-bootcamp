package com.tothenew.multithreading.ques6;

import com.tothenew.intro_to_java_1.ques6.Bank;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {

    private static final Bank account = new Bank(5000);
    private static final Bank account2 = new Bank(6000);

    private static final ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> transfer(account, account2, 1000), "Thread-1");
        Thread thread2 = new Thread(() -> transfer(account2, account, 2000), "Thread-2");

        thread1.start();
        thread2.start();
    }

    private static void transfer(Bank from, Bank to, double amount) {

        lock.lock();

        try {
            if (from.withdraw(amount)) {
                to.addAmount(amount);
                System.out.println(Thread.currentThread().getName()
                        + " transfer completed");
            }

        } catch (Exception e) {
            System.out.println("Thread interrupted");
        } finally {
            lock.unlock();
        }
    }
}
