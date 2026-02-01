package com.tothenew.multithreading.ques3;

public class VolatileExample {

    private static volatile boolean running = true;
//    private static boolean running = true;

    public static void main(String[] args) throws InterruptedException {

        Thread worker = new Thread(() -> {
            System.out.println("Starting worker thread");
            while (running) {
                try {
                    System.out.println("working...");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Worker thread interrupted");
                }
            }
        });

        worker.start();
        Thread.sleep(2000);
        System.out.println("Main thread changing running flag to false");
        running = false;

        worker.join();
        System.out.println("Main thread finished execution");
    }
}
