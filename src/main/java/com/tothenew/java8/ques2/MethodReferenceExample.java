package com.tothenew.java8.ques2;

public class MethodReferenceExample {
    static void main(String[] args) {

        Calculator calculator = new Calculator();

        IOperationsInterface addition = calculator::addition;
        IOperationsInterface subtract = calculator::subtract;
        IOperationsInterface multiply = Calculator::multiplication;

        System.out.println(addition.operation(10, 20));
        System.out.println(subtract.operation(10, 20));
        System.out.println(multiply.operation(10, 20));

    }

}
