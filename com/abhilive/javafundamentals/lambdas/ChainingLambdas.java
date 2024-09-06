package com.abhilive.javafundamentals.lambdas;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class ChainingLambdas {
    
    public static void main(String[] args) {

        Consumer<String> c1 = s -> System.out.println("c1 consumes "+ s);
        Consumer<String> c2 = s -> System.out.println("c2 consumes "+ s);

        // c1.accept("Hello");
        // c2.accept("Hello");

        // Consumer<String> c3 = s -> {
        //     c1.accept(s);
        //     c2.accept(s);
        // };

        Consumer<String> c3 = c1.andThen(c2);

        c3.accept("Hello");

        /* Prdicate */
        Predicate<String> isNull = s -> s == null;
        System.out.println("For null = " + isNull.test(null));
        System.out.println("For Hello = " + isNull.test("Hello"));

        Predicate<String> isEmpty = s -> s.isEmpty();
        System.out.println("For empty" + isEmpty.test(""));
        System.out.println("For Hello" + isEmpty.test("Hello"));

        Predicate<String> isNeitherEmptyNorNull = isNull.negate().or(isEmpty.negate());
        System.out.println("For null = " + isNeitherEmptyNorNull.test(null));
        System.out.println("For empty = " + isNeitherEmptyNorNull.test(""));
        System.out.println("For Hello = " + isNeitherEmptyNorNull.test("Hello"));

    }
}
