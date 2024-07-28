package com.abhilive.javafundamentals.multithreading;

public class MainThread {

    public static void main(String args[]) {
        ThreadByExtendThread TByET = new ThreadByExtendThread();
//        TByET.setName("Code decode");
        TByET.start();

        ThreadByRunnable TByR = new ThreadByRunnable();
        TByR.run();
        for(int i=0; i<=1000; i++) {
            System.out.println("From main thread "+ Thread.currentThread().getName() +": count:"+ i);
        }
    }
}