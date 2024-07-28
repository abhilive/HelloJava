package com.abhilive.javafundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondShortestElement {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5, 2, 8, 1, 3, 9);
        // Find the second shortest element
        Integer secondShortest = nums.stream()
                .distinct() // Remove duplicates
                .sorted() // Sort in ascending order
                .skip(1) // Skip the first element (smallest)
                .findFirst()
                .orElse(null); // Handle empty lists
        System.out.println("List: " + nums);
        System.out.println("secondShortest: "+ secondShortest);
    }
}
