package com.tothenew.multithreading.ques2;

class BankAccount {

    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public synchronized void deposit(int amount) {
        System.out.println(Thread.currentThread().getName() + "deposited using Synchronized Method: " + amount);
        this.balance += amount;
    }

    public void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + "withdrawn using Synchronized Method: " + amount);

        synchronized (this) {
            if (this.balance >= amount) {
                this.balance -= amount;
                System.out.println("Remaining balance: " + this.balance);
            } else {
                System.out.println("Insufficient balance");
            }
        }
    }
}

public class SynchronizedExample {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(5000);

        try {
            Thread thread2 = new Thread(() -> bankAccount.deposit(1000));
            Thread thread1 = new Thread(() -> bankAccount.withdraw(500));

            thread1.start();
            thread2.start();

        } catch (Exception e) {
            System.out.println("Main thread Intruppted :" + e.getMessage());
        }
    }

}
