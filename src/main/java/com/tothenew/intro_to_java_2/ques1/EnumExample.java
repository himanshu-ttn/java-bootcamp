package com.tothenew.intro_to_java_2.ques1;

public class EnumExample {
    static void main(String[] args) {

        House house = House.SMALL_HOUSE;
        System.out.println("House is " + house.ordinal());
        System.out.println("House is " + house.name());
        System.out.println("Price is " + house.getPrice());
        System.out.println("Enum is " + House.SMALL_HOUSE);

        System.out.println("-----------------");

        for (House x : House.values()) {
            System.out.printf("%-15s | %.2f%n", x.name(), x.getPrice());
        }

    }
}
