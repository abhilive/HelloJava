package com.abhilive.javafundamentals;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        // list
        List<Integer> ints = Arrays.asList(1, 2, 3);
        AtomicInteger result = new AtomicInteger();
        ints.stream().forEach(v -> {
            result.addAndGet(v);
        });
        Integer sumResult = ints.stream().reduce((k, ac) -> ac + k).get();
        //ints.stream().map(n -> )
        System.out.println(result);
        System.out.println(sumResult);

        //Return the first non-repeating character in the string.
        List<Integer> nums = Arrays.asList(3, 8, 7, 6, 2, 3, 4, 5);
        int targetSum = 10;

//        Map<Integer, Integer> resultedNums = new HashMap<>();
//        List<Pair> resultantPair = nums.stream().map((Integer t) -> );
//        List<Pair> resultantPair = new ArrayList<>();
        List<List<Integer>> resultantPair = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            int remains = targetSum - num;
            if (seen.contains(remains)) {
//                resultantPair.add(new Pair(num, remains));
                resultantPair.add(Arrays.asList(num, remains));
            }
            seen.add(num);
        }
        System.out.println("Pairs with sum " + targetSum + ": " + resultantPair);
//        resultantPair.forEach(System.out::println);
    }

    public static class Pair<k, v> {
        private int k;
        private int v;

        Pair(int k, int v) {
            this.k = k;
            this.v = v;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "k=" + k +
                    ", v=" + v +
                    '}';
        }
    }

    public static Character firstNonRepeatingChar(String str) {
        // Use a LinkedHashMap to maintain the order of characters
        Map<Character, Integer> characterCount = new LinkedHashMap<>();

        // Count each character's occurrences
        for (char ch : str.toCharArray()) {
            characterCount.put(ch, characterCount.getOrDefault(ch, 0) + 1);
        }

        // Find the first character with a count of 1
        for (Map.Entry<Character, Integer> entry : characterCount.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null; // Return null if there is no non-repeating character
    }


    public static void main1(String[] args) {
        // leap Year -

        int yearS = Integer.valueOf(args[0]);
        int yearE = Integer.valueOf(args[1]);

        List<Integer> years = new ArrayList<>();
        for(int i = yearS; i<=yearE; i++) {
            if(i%4 == 0) {
                years.add(i);
            }
        }
        years.forEach(System.out::println);
    }
}
