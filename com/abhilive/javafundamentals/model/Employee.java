package com.abhilive.javafundamentals.model;

import java.util.List;

public class Employee {
    private String name;
    private int salary;
    private String department;
    private String gender;
    private List<String> cityWorkedIn;

    public Employee(String name, int salary, String department, String gender, List<String> cityWorkedIn) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.gender = gender;
        this.cityWorkedIn = cityWorkedIn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getCityWorkedIn() {
        return cityWorkedIn;
    }

    public void setCityWorkedIn(List<String> cityWorkedIn) {
        this.cityWorkedIn = cityWorkedIn;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", gender='" + gender + '\'' +
                ", cityWorkedIn=" + cityWorkedIn +
                '}';
    }
}
