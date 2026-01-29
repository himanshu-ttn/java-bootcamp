package com.tothenew.multithreading.random;

public class Main {
    static void main(String[] args) throws InterruptedException {
        Thread x = new Thread(() -> {
            System.out.println("Starting thread");
        });

        x.start();
    }
}
