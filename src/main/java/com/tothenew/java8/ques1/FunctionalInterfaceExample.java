package com.tothenew.java8.ques1;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class FunctionalInterfaceExample {

    static void main(String[] args) {

        IGreaterThanInterface isGreater = (a, b) -> a > b;
        BiPredicate<Integer, Integer> checkGreater = (a, b) -> a > b;

        System.out.println("Is 10 greater than 5 ? " + isGreater.execute(10, 5));
        System.out.println("Is 4 greater than 7 ? " + checkGreater.test(5, 7));

        IIncrementedInterface incrementedInterface = (x) -> x + 1;
        Function<Integer, Integer> incrementFunction = (x) -> x + 1;

        System.out.println("Incrementing 5: " + incrementedInterface.increase(5));
        System.out.println("Incrementing 5: " + incrementFunction.apply(5));


        IConcatenatedInterface concatenatedInterface = (a, b) -> a + b;
        BiFunction<String, String, String> concatFunction = (a, b) -> a + b;
        System.out.println("Concatenating 'Hello' + 'world' : " + concatenatedInterface.concatenate("Hello", " world"));
        System.out.println("Concatenating 'Hello' + 'world' : " + concatFunction.apply("Hello", " world"));

        IStringToUpperCaseInterface stringToUpperCaseInterface = (x) -> x.toUpperCase();
        Function<String, String> stringToUpperCaseFunction = (x) -> x.toUpperCase();

        System.out.println("Concatenating 'Hello' + 'world' : " + stringToUpperCaseInterface.toUpperCase("himanshu"));
        System.out.println("Concatenating 'Hello' + 'world' : " + stringToUpperCaseFunction.apply("himanshu"));


    }
}
