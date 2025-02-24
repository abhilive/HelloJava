package com.abhilive.javafundamentals.oops.inheritance;

public class Test {
    public static void main(String[] args) {
        Parent p = new Child();
        System.out.println(p.a); // Variable hiding - Compile Time
        p.printValue(); // Method Overriding - Runtime

        Child c = new Child();
        c.printValue("Ronny");

        // When non static inner class
//        Parent.InnerChild iC = p.new InnerChild();

        // When static inner class
        Parent.InnerChild iC = new Parent.InnerChild();
        iC.methodFromInnerClass();
    }
}
