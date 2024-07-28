package com.abhilive.javafundamentals.solidPrinciples.liskovSubstitution;

public class Rectangle extends Shape {

    private int sideA;
    private int sideB;

    Rectangle(int sideA, int sideB) {
        super(sideA, sideB);
    }

    @Override
    public int calculateArea() {
        return sideA * sideB;
    }
}
