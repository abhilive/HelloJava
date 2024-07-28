package com.abhilive.javafundamentals.solidPrinciples.liskovSubstitution;

public class Shape {
    private int sideA;
    private int sideB;

    Shape(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int calculateArea() {
        return sideA * sideB;
    }

}
