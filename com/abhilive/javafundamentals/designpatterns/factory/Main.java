package com.abhilive.javafundamentals.designpatterns.factory;

public class Main {
    public static void main(String[] args) {
        Fruit fruit = FruitFactory.getFruit("Mango");
        System.out.println(fruit.name());

        Fruit fruit1 = FruitFactory.getFruit("Papaya");
        System.out.println(fruit1.name());
    }
}
