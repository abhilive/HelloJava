package com.abhilive.javafundamentals.designpatterns.abstractFactory;

public class EmployeeFactory {

    public static Employee getEmployee(EmployeeAbstractFactory employeeAbstractFactory) {
        return employeeAbstractFactory.getEmployee();
    }
}
