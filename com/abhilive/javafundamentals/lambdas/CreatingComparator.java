package com.abhilive.javafundamentals.lambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class CreatingComparator {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight", "nine");

        Comparator<String> cmp = (s1, s2) -> s1.compareTo(s2);
        strings.sort(cmp);
        System.out.println(strings);

        /* sort in length */

        // Comparator<String> cmp2 = (s1, s2) -> Integer.compare(s1.length(), s2.length());

        // Function<String, Integer> toLength = s -> s.length();
        // Comparator<String> cmp2 = Comparator.comparing(toLength);

        /* more elegant way */
        ToIntFunction<String> toLength = s -> s.length();
        Comparator<String> cmp2 = Comparator.comparingInt(toLength);
        
        strings.sort(cmp2);
        System.out.println(strings);
    
    }
}
