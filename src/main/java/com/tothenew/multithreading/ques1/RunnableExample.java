package com.tothenew.multithreading.ques1;

public class RunnableExample implements Runnable {

    @Override
    public void run() {
        System.out.println("Running " + this.getClass().getName());

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Runnable Thread Interrupted");
        }
    }
}
