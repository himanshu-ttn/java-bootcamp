package com.tothenew.multithreading.ques8;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class RandomNumber implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        Random random = new Random();
        int number = random.nextInt(271100);
        System.out.println("Generated number by thread: " + number);
        return number;
    }
}

public class FutureExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<Integer> future = executor.submit(new RandomNumber());

        Integer result = future.get();

        System.out.println("Returned value from future: " + result);

        executor.shutdown();
    }
}
