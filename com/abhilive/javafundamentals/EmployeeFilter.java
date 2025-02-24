package com.abhilive.javafundamentals;

import com.abhilive.javafundamentals.model.Employee;
import jdk.nashorn.internal.parser.JSONParser;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeFilter {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Emp1", 21000, "HR", "Male", Arrays.asList("City1"));
        Employee emp2 = new Employee("Emp2", 30000, "IT", "Male", Arrays.asList("City2"));
        Employee emp3 = new Employee("Emp3", 25000, "Account", "Female", Arrays.asList("City3"));
        Employee emp4 = new Employee("Emp4", 22000, "HR", "Female", Arrays.asList("City4"));
        Employee emp5 = new Employee("Emp5", 25000, "IT", "Male", Arrays.asList("City5"));

        List<Employee> employeeList = Arrays.asList(emp1, emp2, emp3, emp4, emp5);

        System.out.println("** Employee lists:");
        employeeList.forEach(System.out::println);

        System.out.println("** Order employee based on Salary");
        employeeList.stream().sorted((a, b) -> b.getSalary() - a.getSalary())
                .forEach(System.out::println);

        System.out.println("** Find employee with second highest salary");
        employeeList.stream().collect(Collectors.groupingBy(Employee::getSalary))
                .entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .collect(Collectors.toList()).get(1).getValue().forEach(System.out::println);

        System.out.println("** Top 3 high paid Employees");
        employeeList.stream().sorted((a, b) -> b.getSalary() - a.getSalary())
                .limit(3)
                .forEach(System.out::println);

        System.out.println("** Least top 2 salaried employees");
        employeeList.stream().sorted((a, b) -> b.getSalary() - a.getSalary())
                .skip(3)
                .forEach(System.out::println);

        System.out.println("** Get distinct departments");
        employeeList.stream().map(Employee::getDepartment)
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("** Get highest paid employee:");
        String empName = employeeList.stream()
                .collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)))
                .get().getName();
        System.out.println(empName);

        System.out.println("** Find IT department employees:");
        employeeList.stream()
                .filter(employee -> employee.getDepartment().equals("IT"))
                .forEach(System.out::println);

        System.out.println("** Group Employee based on department:");
        Map<String, List<Employee>> filteredList = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(filteredList);
    }
}
