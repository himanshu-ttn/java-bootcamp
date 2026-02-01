package com.tothenew.java8.ques3;

public class MultiInheritanceExample implements InterfaceA, InterfaceB {

    //   :: here it is important to override default function if 2 interface have same method name
    @Override
    public void show() {
        InterfaceA.super.show();
        InterfaceB.super.show();
        System.out.println("MultiInheritanceExample class");
    }

    static void main(String[] args) {
        MultiInheritanceExample example = new MultiInheritanceExample();
        example.show();
    }
}
