package com.abhilive.javafundamentals.designpatterns.abstractFactory;

public class AndriodDeveloperFactory implements EmployeeAbstractFactory {
    @Override
    public Employee getEmployee() {
        return new AndriodDeveloper();
    }
}
