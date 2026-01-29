package com.tothenew.java8.ques9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEmployeeExample {
    static void main(String[] args) {

        Long minSalary = 5000L;

        List<Employee> employees = Arrays.asList(
                new Employee("Rahul Sharma Singh", 4000L, "Delhi"),
                new Employee("Anita Verma Gupta", 3000L, "Delhi"),
                new Employee("Rahul Kumar Das", 4500L, "Delhi"),
                new Employee("Vikas Mehta Roy", 7000L, "Mumbai"),
                new Employee("Priya Sharma Jain", 3500L, "Delhi")
        );

        List<String> uniqueFirstName = employees.stream()
                .filter((data) -> data.getCity().equalsIgnoreCase("Delhi"))
                .filter((emp) -> emp.getSalary() < minSalary)
                .map((emp) -> emp.getFullName().split(" ")[0])
                .distinct()
                .toList();

        System.out.println(uniqueFirstName);
    }
}
