package com.abhilive.javafundamentals.solidPrinciples.liskovSubstitution;

public class MainClass {

    public static void main(String[] args) {
        Rectangle rec = new Rectangle(10, 20);
        System.out.println("Rectangle Area: "+rec.calculateArea());

        Square square = new Square(10, 20);
        System.out.println("Square Area: "+square.calculateArea());
    }
}
