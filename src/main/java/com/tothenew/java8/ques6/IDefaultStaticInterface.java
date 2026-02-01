package com.tothenew.java8.ques6;

public interface IDefaultStaticInterface {

    void show();

    default void display() {
        System.out.println("default funtion of Interface");
    }

    static void staticMethod() {
        System.out.println("staticMethod of interface");
    }
}
