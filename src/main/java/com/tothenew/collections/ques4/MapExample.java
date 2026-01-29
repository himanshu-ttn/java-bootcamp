package com.tothenew.collections.ques4;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    static void main(String[] args) {
        Map<EmpKey, Double> salaryMap = new HashMap<>();

        EmpKey e1 = new EmpKey("Rahul", 25, "Developer");
        EmpKey e2 = new EmpKey("Amit", 30, "Manager");
        EmpKey e3 = new EmpKey("Neha", 28, "Tester");

        salaryMap.put(e1, 50000.0);
        salaryMap.put(e2, 80000.0);
        salaryMap.put(e3, 60000.0);

        // Access salary using key
        System.out.println("Salary of Rahul: " + salaryMap.get(e1));

        // Test equality with new object having same data
        EmpKey e4 = new EmpKey("Rahul", 25, "Developer");
        System.out.println("Salary using new object key: " + salaryMap.get(e4));


        System.out.println("\nAll Employees:");
        for (Map.Entry<EmpKey, Double> entry : salaryMap.entrySet()) {
            System.out.println(entry.getKey() + " → Salary: " + entry.getValue());
        }
    }
}
