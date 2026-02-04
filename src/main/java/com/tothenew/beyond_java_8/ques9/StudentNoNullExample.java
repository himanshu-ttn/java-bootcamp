package com.tothenew.beyond_java_8.ques9;

/**
 * Create a Record for the Student with the following Fields:
 * id
 * name
 * standard
 * <p>
 * Make sure that no null values are used for initialization.
 * <p>
 * Use equal and hashCode methods with Student records
 *
 */

record Student(int id, String name, int standard) {

    Student {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
    }
}

public class StudentNoNullExample {

    static void main(String[] args) {

        Student student1 = new Student(1, "Rahul", 10);
        Student student2 = new Student(1, "Rahul", 10);

        // Using equals() method
        System.out.println("student1 equals student2: " + student1.equals(student2));

        // Using hashCode() method
        System.out.println("student1 hashCode: " + student1.hashCode());
        System.out.println("student2 hashCode: " + student2.hashCode());
    }

}
