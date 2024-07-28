package com.abhilive.javafundamentals.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MoreLambdas {
    
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("one", "two", "three", "four", "five");

        Predicate<String> filter = string -> string.startsWith("t");
        strings.removeIf(filter);

        Consumer<String> action = string -> System.out.println(string);
        strings.forEach(action);

        // other way
        strings.removeIf(string -> !string.startsWith("t"));
        strings.forEach(string -> System.out.println(string));

    }
}
