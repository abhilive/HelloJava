package com.abhilive.javafundamentals.multithreading;

public class ThreadByRunnable implements Runnable {

    public void run() {
        for(int i=1; i<=100; i++) {
            System.out.println();
            System.out.println("From child thread "+ Thread.currentThread().getName() +": count:"+ i);
        }
    }
}
