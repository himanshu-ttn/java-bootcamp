package com.tothenew.collections.ques2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeExample {
    static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Rahul Sharma", 25.0, 50000.0));
        employees.add(new Employee("Amit Verma", 30.0, 70000.0));
        employees.add(new Employee("Rahul Mehta", 28.0, 60000.0));
        employees.add(new Employee("Neha Singh", 35.0, 90000.0));

        Collections.sort(employees);

        System.out.println("Sorted by Name: ");
        for (Employee e : employees) {
            System.out.println(e);
        }

        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getSalary().compareTo(o2.getSalary());
            }
        });

        System.out.println("\nSorted by Salary (Comparator):");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
