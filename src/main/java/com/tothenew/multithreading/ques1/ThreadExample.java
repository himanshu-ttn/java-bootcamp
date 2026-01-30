package com.tothenew.multithreading.ques1;

import com.tothenew.java8.ques4.GameCharacter;

public class ThreadExample extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Thread class running: " + i);
                Thread.sleep(1500);
            }

        } catch (InterruptedException e) {
            System.err.println("Thread Interrupted while waiting");
        }
    }
}
