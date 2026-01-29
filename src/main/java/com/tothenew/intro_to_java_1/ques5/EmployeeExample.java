package com.tothenew.intro_to_java_1.ques5;

public class EmployeeExample {
    static void main() {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee("Himanshu", "verma", (short) 25, "Software Developer Trainee");
        Employee employee3 = new Employee("Sonu", "Gupta", (short) 25);
        Employee employee4 = new Employee(employee1);

        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
        System.out.println(employee3.toString());
        System.out.println(employee4.toString());


    }
}
