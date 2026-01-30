package com.tothenew.java8.ques5;

import com.tothenew.java8.ques4.GameCharacter;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceExample {

    static void main(String[] args) {

        Consumer<String> greet = (name) -> System.out.println("Hello " + name);
        greet.accept("Himanshu");

        Supplier<GameCharacter> getCharacter = () -> new GameCharacter("Dummy", 50)  ;
        GameCharacter temp = getCharacter.get();

        Predicate<Integer> isEven = (num) -> (num % 2) == 0;
        int num = 10;
        System.out.println(num + " isEven " + isEven.test(num));

        Function<String, Integer> getLength = (str) -> str.length();
        System.out.println("getLength " + getLength.apply("Himanshu Verma"));

    }
}
