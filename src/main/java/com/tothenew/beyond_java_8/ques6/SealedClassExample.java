package com.tothenew.beyond_java_8.ques6;


import java.util.ArrayList;
import java.util.List;

abstract sealed class Vehicle permits Car, Bike, Truck {
    public abstract void start();
}

final class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting");
    }
}

sealed class Bike extends Vehicle permits MountainBike {
    @Override
    public void start() {
        System.out.println("Bike is starting");
    }
}

final class MountainBike extends Bike {
    @Override
    public void start() {
        System.out.println("Mountain Bike is starting");
    }
}

non-sealed class Truck extends Vehicle {
    @Override
    public void start() {
        System.out.println("Truck is starting");
    }
}

class PickupTruck extends Truck {
    @Override
    public void start() {
        System.out.println("Pickup Truck is starting");
    }
}

public class SealedClassExample {

    static void main(String[] args) {

        List<Vehicle> vehicles = List.of(new Car(), new MountainBike(), new PickupTruck());

        for (Vehicle vehicle : vehicles) {
            vehicle.start();
        }
    }
}
