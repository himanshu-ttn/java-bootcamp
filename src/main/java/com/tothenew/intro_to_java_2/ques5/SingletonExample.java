package com.tothenew.intro_to_java_2.ques5;

public class SingletonExample {
    static void main(String[] args) {

        SystemManger manger = SystemManger.getInstance();
        manger.log("Hello World!");

        // this will be getting the same instance :)
        SystemManger tempManger = SystemManger.getInstance();
        System.out.println(tempManger.getLog());
    }
}
