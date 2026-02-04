package com.tothenew.beyond_java_8.ques5;

/**
 * Use record to create an immutable represent of student(name, id, age) and use its constructor for initialization, equals to compare 2 students methods. Also keep a static counter to keep the count of objects created.
 *
 */

record Student(String name, int id, int age) {
    private static int counter = 0;

    Student {
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
}

public class StudentRecordExample {

    static void main(String[] args) {

        Student student1 = new Student("Bacha", 25, 42);
        Student student2 = new Student("Chotu", 21, 94);
        Student student3 = new Student("Motu", 23, 15);
        Student student4 = new Student("Bacha", 25, 42);


        System.out.println(student1);
        System.out.println(student2);

        System.out.println("student1 equals student2? " + student1.equals(student2)); // false
        System.out.println("student1 equals student4? " + student1.equals(student4)); // trye

        System.out.println("Total Students created: " + Student.getCounter());
    }
}
