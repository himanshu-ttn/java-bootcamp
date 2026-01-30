package com.tothenew.java8.ques3;

public interface InterfaceA {
    default void show(){
        System.out.println("InterfaceA");
    }


}

interface InterfaceB {
    default void show(){
        System.out.println("InterfaceB");
    }
}
