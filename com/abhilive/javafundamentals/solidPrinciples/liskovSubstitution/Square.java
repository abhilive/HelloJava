package com.abhilive.javafundamentals.solidPrinciples.liskovSubstitution;

public class Square extends Rectangle {

    private int sideA;
    private int sideB;
    public Square(int sideA, int sideB) {
        super(sideA, sideB);
    }

    @Override
    public int calculateArea() {
        return sideA * sideB;
    }
}
