package com.tothenew.java8.ques9;


public class Employee {
    private String fullName;
    private Long salary;
    private String city;

    public Employee(String fullName, Long salary, String city) {
        this.fullName = fullName;
        this.salary = salary;
        this.city = city;
    }

    public String getFullName() {
        return fullName;
    }

    public Long getSalary() {
        return salary;
    }

    public String getCity() {
        return city;
    }
}

