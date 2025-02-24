package com.abhilive.javafundamentals.oops.inheritance;

public class Parent {
    int a = 10;

    void printValue() {
        System.out.println("Inside Child: "+ a);
    }

    static class InnerChild {
        void methodFromInnerClass() {
            System.out.println("calling inner method");
        }
    }
}
