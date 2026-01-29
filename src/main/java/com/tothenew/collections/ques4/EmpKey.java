package com.tothenew.collections.ques4;

import java.util.Objects;

/**
 * This class is to implement key feature of Map class for modifying hashcode() and equals()
 * the equals checks foe the data equal in the object like name , age and return true
 * and orverideing the hashcode to generate hash based on name, age, designation
 *
 */
public class EmpKey {

    private String name;
    private int age;
    private String designation;

    public EmpKey(String name, int age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDesignation() {
        return designation;
    }

    // 🔹 Must override equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmpKey)) return false;
        EmpKey e = (EmpKey) o;
        return age == e.age &&
                name.equals(e.name) &&
                designation.equals(e.designation);
    }

    // 🔹 Must override hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(name, age, designation);
    }

    @Override
    public String toString() {
        return name + " | " + age + " | " + designation;
    }
}

