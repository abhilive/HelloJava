package com.abhilive.javafundamentals.designpatterns.singleton;

import java.io.Serializable;

public class LazySingleton implements Serializable, Cloneable {
    /**
     * Constructor Private
     * Create private field to store object
     * Create method to return new object
     */
    private static LazySingleton lazySingleton;
    private LazySingleton() {
        if(lazySingleton != null) {
            throw new RuntimeException("You are trying to break Singleton pattern");
        }
    }

    public static LazySingleton getLazySingleton() {
        if(lazySingleton == null)  {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    public Object readResolve() {
        return lazySingleton;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // Solution: return lazySingleton
    }
}
