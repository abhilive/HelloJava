package com.abhilive.javafundamentals.designpatterns.singleton;

public class MainSingleton {

    public static void main(String[] args) {
        System.out.println("Eager Singleton: ");
        LazySingleton lazySingleton = LazySingleton.getLazySingleton();
        System.out.println(lazySingleton.hashCode());

        LazySingleton lazySingleton1 = LazySingleton.getLazySingleton();
        System.out.println(lazySingleton1.hashCode());

        System.out.println("Lazy Singleton: ");
        EagerSingleton eagerSingleton = EagerSingleton.getEagerSingleton();
        System.out.println(eagerSingleton.hashCode());

        EagerSingleton eagerSingleton1 = EagerSingleton.getEagerSingleton();
        System.out.println(eagerSingleton1.hashCode());
    }
}
