package com.abhilive.javafundamentals;

import java.util.*;
import java.util.stream.Collectors;

public class NthHighestSalary {
    public static void main(String[] args) {
        Map<String, Integer> empList = new HashMap<>();
        empList.put("Anil", 10000);
        empList.put("Bhavna", 13000);
        empList.put("Micheal", 15000); // 2nd Highest
        empList.put("Mahima", 17000);
        empList.put("Ankit", 12000); // 4th Highest
        empList.put("Sunder", 11000);

        Map<String, Integer> empList2 = new HashMap<>();
        empList2.put("Anil", 10000); // 5th Highest
        empList2.put("Bhavna", 13000); // 3rd Highest
        empList2.put("Micheal", 15000); // 2nd Highest
        empList2.put("Mahima", 17000); // Highest
        empList2.put("Ankit", 15000); // 2nd Highest
        empList2.put("Sunder", 11000); // 4th Highest

        Map.Entry<String, Integer> result = getNthHightestSalary(empList, 4);

        System.out.println(result);

        Map.Entry<Integer, List<String>> result2 = getNthHightestSalaryModified(empList2, 6);

        System.out.println(result2);
    }

    public static Map.Entry<String, Integer> getNthHightestSalary(Map<String, Integer> map, int num) {
        return map.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toList()).get(num-1);
    }

    public static Map.Entry<Integer, List<String>> getNthHightestSalaryModified(Map<String, Integer> map, int num) {
        return map.entrySet().stream()
                .collect(Collectors.groupingBy(
                        Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())
                ))
                .entrySet()
                .stream()
                .sorted(
                        Collections.reverseOrder(Map.Entry.comparingByKey())
                )
                .collect(Collectors.toList()).get(num-1);
    }
}
