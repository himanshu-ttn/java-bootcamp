package com.tothenew.multithreading.ques1;

public class MultithreadMain {

    static void main(String[] args) {

        RunnableExample runnableTask = new RunnableExample();
        Thread thread = new Thread(runnableTask);

        ThreadExample threadExample = new ThreadExample();

        thread.start();
        threadExample.start();

        try {

            thread.join();
            threadExample.join();

        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Main thread finished execution");
    }
}
