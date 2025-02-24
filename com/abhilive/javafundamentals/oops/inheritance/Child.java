package com.abhilive.javafundamentals.oops.inheritance;

public class Child extends Parent {
    int a = 20;

    void printValue() {
        System.out.println("Inside Child: "+ a);
    }

    void printValue(String name) {
        System.out.println("Inside Child: "+ a + " Hello: "+ name);
    }

}
