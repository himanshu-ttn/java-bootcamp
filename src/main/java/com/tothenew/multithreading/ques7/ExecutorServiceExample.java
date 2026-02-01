package com.tothenew.multithreading.ques7;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorServiceExample {

    public static void main(String[] args) throws Exception {

        List<Callable<String>> callableTasks = new ArrayList<Callable<String>>();

        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            callableTasks.add(() -> {
                System.out.println(Thread.currentThread().getName() + " executing Task " + taskId);
                Thread.sleep(1000);
                return "Task " + taskId + " completed";
            });
        }

        runTasks(Executors.newSingleThreadExecutor(), callableTasks);
        runTasks(Executors.newFixedThreadPool(3), callableTasks);
        runTasks(Executors.newCachedThreadPool(), callableTasks);

    }

    public static void runTasks(ExecutorService executor, List<Callable<String>> callableTasks) throws Exception {
        List<Future<String>> results = new ArrayList<Future<String>>();

        for (Callable<String> callableTask : callableTasks) {
            results.add(executor.submit(callableTask));
        }

        for (Future<String> future : results) {
            System.out.println(future.get());
        }
    }
}
