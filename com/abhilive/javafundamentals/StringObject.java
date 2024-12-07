package com.abhilive.javafundamentals;

public class StringObject {
    public static void main(String[] args) {
        // string object creation
        String str = new String("string_object"); // two objects will be created
        // 1. Object -> New -> Heap
        // 2. Object -> Literal -> SCP

        String str1 = "string_object"; // single object
        // Intern method used to get reference from SCP
        System.out.println(str1.intern());
        System.out.println(str1.intern().hashCode() == str.hashCode());
    }
}
