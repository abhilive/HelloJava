package com.abhilive.javafundamentals.designpatterns.abstractFactory;

public class Main {
    public static void main(String[] args) {
        Employee andriodDeveloper = EmployeeFactory.getEmployee(new AndriodDeveloperFactory());
        System.out.println(andriodDeveloper.name());

        Employee webDeveloper = EmployeeFactory.getEmployee((new WebDeveloperFactory()));
        System.out.println(webDeveloper.name());
    }
}
