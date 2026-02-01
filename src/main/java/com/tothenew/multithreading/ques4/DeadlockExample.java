package com.tothenew.multithreading.ques4;

import com.tothenew.intro_to_java_1.ques6.Bank;

public class DeadlockExample {

    private static final Bank account = new Bank(5000);
    private static final Bank account2 = new Bank(6000);

    public static void main(String[] args) {

        Thread thread = new Thread(() -> {
            synchronized (account) {
                System.out.println("Thread-1 acquired lock on account");
                account.addAmount(1000);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Thread-1 interrupted");
                }
                synchronized (account2) {
                    System.out.println("Thread-1 acquired lock on account2");
                }
            }
        });


        Thread thread2 = new Thread(() -> {
            synchronized (account2) {
                System.out.println("Thread-2 acquired lock on account2");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    System.out.println("Thread-2 interrupted");
                }

                synchronized (account) {
                    System.out.println("Thread-2 acquired lock on account");
                }
            }
        });

        thread.start();
        thread2.start();

    }
}
