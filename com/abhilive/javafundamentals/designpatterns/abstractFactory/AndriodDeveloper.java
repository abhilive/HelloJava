package com.abhilive.javafundamentals.designpatterns.abstractFactory;

public class AndriodDeveloper implements Employee {
    @Override
    public int salary() {
        return 15000;
    }

    @Override
    public String name() {
        return "Android Developer";
    }
}
