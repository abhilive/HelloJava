package com.abhilive.javafundamentals;

import java.io.PrintStream;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Hello {

    public static void main(String args[]) {
        System.out.println("Hello World !!");
        System.out.println("Thread Name is:" +Thread.currentThread().getName());

        Map<String, String> metadata = new HashMap<>();
        metadata.put("Father", "Satya Prakash");
        metadata.put("Mother", "Neelam Devi");

        ImmutableStudentClass student = new ImmutableStudentClass("Ravi", 25, metadata);

        System.out.println(student.getName());
        System.out.println(student.getRegNo());

        metadata.put("Address", "123, Dadar Road, Mumbai");
        // Remains unchanged due to deep copy in constructor
        System.out.println(student.getMetadata());

        student.getMetadata().put("Father", "Surya Prakash");
        // Remains unchanged due to deep copy in getter
        System.out.println(student.getMetadata());

        /**/
        System.out.println("String group by nos counts:");
        List<String> stringList = Arrays.asList("AA", "BB", "AA", "CC");
        Map<String, Long> result = stringList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        result.forEach((k,v) -> System.out.println("String -> "+k+" Count: "+v));

    }

    public static void main2(String[] args) {
        PrintStream out = System.out;
        out.println("Hello World !!");

        List<String> students = new ArrayList<>(0);
        students.add(0, null);
        students.add(1, "Abhishek");

        System.out.println(students.size());
        System.out.println(students.get(0));

        for(String stu : students) {
            System.out.println(stu);
        }

        Integer[] intArray = new Integer[]{9, 8 ,8 ,9, 7, 5, 4, 3, 2, 1};
        List<Integer> intListWithDup = Arrays.asList(intArray);

        List<Integer> listwithoutDup = intListWithDup.stream().distinct().collect(Collectors.toList());
        listwithoutDup.forEach(s -> System.out.println(s));
        // for(int in : listwithoutDup) {
        //     System.out.println(in);
        // }

        String[] strArray = new String[]{"Beetroot", "Carrot"};
        System.out.println(strArray[0]);

        for(String str : strArray) {
            System.out.println(str);
        }
        System.out.println("--------------");
        List<String> strArrayList = Arrays.asList(strArray);
        System.out.println(strArrayList);

        List<String> fruits = Arrays.asList("Apple", "Bnana", "Grapes", "Pomegranet");
        fruits.stream().filter(s -> s.equals("Apple")).forEach(System.out::println);

        List<Integer> nums = new ArrayList<>(5);
        nums.add(10);
        nums.add(20);
        nums.stream().map(n -> n*10).forEach(System.out::println);

    }
}
