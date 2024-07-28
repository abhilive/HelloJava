package com.abhilive.javafundamentals.designpatterns.singleton;

public class SynchronizedLazySingleton {

    private static SynchronizedLazySingleton synchronizedLazySingleton;
    private SynchronizedLazySingleton() {

    }

    private static SynchronizedLazySingleton getSynchronizedLazySingleton() {
        if(synchronizedLazySingleton == null) {
            synchronized (SynchronizedLazySingleton.class) {
                if(synchronizedLazySingleton == null) {
                    synchronizedLazySingleton = new SynchronizedLazySingleton();
                }
            }
        }
        return synchronizedLazySingleton;
    }
}
