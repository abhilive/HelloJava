package com.abhilive.javafundamentals.designpatterns.singleton;

public class EagerSingleton {
    private static EagerSingleton eagerSingleton = new EagerSingleton();

    public static EagerSingleton getEagerSingleton() {
        return eagerSingleton;
    }
}
