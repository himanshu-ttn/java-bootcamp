package com.tothenew.multithreading.ques5;

import java.util.concurrent.*;

public class CallableExample {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable runnableTask = () -> {
            System.out.println("Runnable task running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Runnable task interrupted" + ex.getMessage());
            }
        };

        Callable<Integer> callableTask = () -> {
            System.out.println("Callable task running");
            Thread.sleep(1000);
            return 27;
        };

        executor.submit(runnableTask);

        Future<Integer> futureTask = executor.submit(callableTask);

        try {
            Integer result = futureTask.get();
            System.out.println("Result from Callable: " + result);

        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        } catch (ExecutionException e) {
            System.out.println("ExecutionException");
        }
        executor.shutdown();
    }
}
