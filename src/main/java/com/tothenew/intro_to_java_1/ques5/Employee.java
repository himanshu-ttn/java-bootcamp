package com.tothenew.intro_to_java_1.ques5;

/**
 * Ques: 5:
 * Create a class named Employee with fields firstname,lastname,age and designation.
 * <p>
 * The class should:
 * <p>
 * 1. have all types of constructors to initialize the object
 * <p>
 * 2. class should also have setter methods to update a particular field
 * <p>
 * 3. Override its toString method to display a meaningful message using all these fields.
 *
 *
 */
public class Employee {
    private String firstName;
    private String lastName;
    private short age;
    private String designation;

    public Employee() {
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.designation = "";
    }

    public Employee(String firstName, String lastName, short age, String designation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.designation = designation;
    }

    public Employee(String firstName, String lastName, short age) {
        this(firstName, lastName, age, "Software Developer Trainee");
    }

    public Employee(Employee employee) {
        this.firstName = employee.getFirstName();
        this.lastName = employee.getLastName();
        this.age = employee.getAge();
        this.designation = employee.getDesignation();
    }

    @Override
    public String toString() {
        return "----Employee Data ----\n" +
                "First Name: " + firstName + "\n" +
                "Last Name: " + lastName + "\n" +
                "Age: " + age + "\n" +
                "Designation: " + designation;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
