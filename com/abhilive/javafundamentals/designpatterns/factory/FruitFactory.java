package com.abhilive.javafundamentals.designpatterns.factory;

public class FruitFactory {

    public static Fruit getFruit(String fruitName) {
        if(fruitName.trim().equalsIgnoreCase("Mango")) {
            return new Mango();
        } else if (fruitName.trim().equalsIgnoreCase("Papaya")) {
            return new Papaya();
        } else {
            return null;
        }
    }
}
