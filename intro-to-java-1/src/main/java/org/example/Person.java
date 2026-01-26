package org.example;

// Ques: 1
// Write a class with FirstName, LastName & age field. Print Firstname, LastName & age using static block, static method & static variable respectively.
public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    // :: static variables ::
    public static String FirstName;
    public static String LastName;
    public static int Age;


    public static Person getInstance(String firstName, String lastName, int age) {
        return new Person(firstName, lastName, age);
    }

    public static void Showdata(Person person) {
        System.out.println("firstName: " + person.firstName);
        System.out.println("lastName: " + person.lastName);
        System.out.println("age: " + person.age);
    }

    public void printData() {
        System.out.println("firstName: " + firstName);
        System.out.println("lastName: " + lastName);
        System.out.println("age: " + age);
    }

}
