package com.abhilive.javafundamentals.designpatterns.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class BreakSingleton {
    /**
     * 1. Reflection API to break Singleton
     * Solution:
     *  a. If Object exists throw Exception (from inside constructor)
     *  b. Use ENUM
     *
     * 2. Use Serialization and Deserialization
     * Solution: Implementing readResolve method
     *
     * 3. Cloning
     * Solution: Return same class instance
     *
     */
    public static void main(String[] args) throws Exception {

        LazySingleton lazySingleton = LazySingleton.getLazySingleton();
        System.out.println(lazySingleton.hashCode());

         /* Reflection API */
//        Constructor<LazySingleton> lazySingletonConstructor = LazySingleton.class.getDeclaredConstructor();
//        lazySingletonConstructor.setAccessible(true);
//        LazySingleton lazySingleton1 = lazySingletonConstructor.newInstance();
//        System.out.println(lazySingleton1.hashCode());

        // using ENUM
//        LazySingletonEnum lazySingletonEnum = LazySingletonEnum.INSTANCE;
//        System.out.println(lazySingletonEnum.hashCode());
//        LazySingletonEnum lazySingletonEnum2 = LazySingletonEnum.INSTANCE;
//        System.out.println(lazySingletonEnum2.hashCode());

        /* Use Serialization and Deserialization */
//        LazySingleton lazySingleton2 = LazySingleton.getLazySingleton();
//        System.out.println(lazySingleton2.hashCode());
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.obj"));
//        oos.writeObject(lazySingleton2);
//
//        System.out.println("Serialization done.");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.obj"));
//        LazySingleton lazySingleton3 = (LazySingleton) ois.readObject();
//        System.out.println(lazySingleton3.hashCode());

        /* Using Cloning */
        LazySingleton lazySingleton1 = (LazySingleton) lazySingleton.clone();
        System.out.println(lazySingleton1.hashCode());
    }
}
