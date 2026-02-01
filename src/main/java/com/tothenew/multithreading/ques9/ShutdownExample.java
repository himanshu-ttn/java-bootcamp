package com.tothenew.multithreading.ques9;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadTask implements Runnable {

    private final int taskId;

    public ThreadTask(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println("Task " + taskId + " started by " +
                Thread.currentThread().getName());
        try {
            Thread.sleep(5000); // simulate long-running task
            System.out.println("Task " + taskId + " completed");

        } catch (InterruptedException e) {
            System.out.println("Task " + taskId + " interrupted");
        }

    }
}

public class ShutdownExample {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 4; i++) {
            executor.submit(new ThreadTask(i));
        }

        System.out.println("\nCalling shutdown()");
        executor.shutdown();   // allows running tasks to finish

        ExecutorService executor2 = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 4; i++) {
            executor2.submit(new ThreadTask(i));
        }

        Thread.sleep(1000);

        System.out.println("\nCalling shutdownNow()");
        List<Runnable> pendingTasks = executor2.shutdownNow(); // interrupts running tasks

        System.out.println("Pending tasks count: " + pendingTasks.size());
    }
}
