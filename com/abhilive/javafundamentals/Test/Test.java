package com.abhilive.javafundamentals.Test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        System.out.println("Here!");
        List<String> stringList = Arrays.asList("AA", "BB", "AA", "CC");
//        Map<String, Long> result = stringList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<String, Long> result = stringList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        result.forEach((k,v) -> System.out.println(k + v));
    }

}
