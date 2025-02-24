package com.abhilive.javafundamentals.designpatterns.abstractFactory;

public class WebDeveloperFactory implements EmployeeAbstractFactory {
    @Override
    public Employee getEmployee() {
        return new WebDeveloper();
    }
}
