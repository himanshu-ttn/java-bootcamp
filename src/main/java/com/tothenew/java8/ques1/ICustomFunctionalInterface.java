package com.tothenew.java8.ques1;

@FunctionalInterface
public interface ICustomFunctionalInterface<T> {
    public T execute(T input);
}

@FunctionalInterface
interface IGreaterThanInterface {
    boolean execute(int first,int second);
}

@FunctionalInterface
interface IIncrementedInterface {
    int increase(int number);
}

@FunctionalInterface
interface IConcatenatedInterface {
    String concatenate(String first, String second);
}

@FunctionalInterface
interface IStringToUpperCaseInterface{
    String toUpperCase(String string);
}