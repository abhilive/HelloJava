package com.abhilive.javafundamentals;

public class WrapperClasses {

    public static void main(String[] args) {
        /**
         * Eight primitive types in JAVA
         * Primitives: byte, short, int, long, float, double, char, boolean
         * Wrapper Cl: Byte, Short, Integer, Long, Float, Double, Character, Boolean
         *
         * Advantage of wrapper class :
         * 1. To wrap primitive into Object form
         * 2. To provide utility methods which are required for the primitives
         */
        String string = "20";
        System.out.println(Integer.parseInt(string)); // String to int

        Integer integer = Integer.parseInt(string);
        System.out.println(integer.toString()); // Integer to String
        System.out.println(String.valueOf(integer)); // Integer to String

        // Autoboxing
        int i = 10;
        Integer i1 = Integer.valueOf(10);
        // Auto Unboxing
        Integer i2 = new Integer(20);
        int j = i2.intValue();

    }
}
