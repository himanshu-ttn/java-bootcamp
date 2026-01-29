package com.tothenew.intro_to_java_1.ques7;

public class MultiTryCatch {
    static void main(String[] args) {

        int[] numbers = {10, 0, 5};
        int[] array = null;


        try {
            int result = numbers[0] / numbers[1];
            System.out.println("Result: " + result);

            System.out.println("Printing array lenght " + array.length);

            System.out.println("Accessing invalid index: " + numbers[5]);

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occurred: " + e);

        } catch (NullPointerException e) {
            System.out.println("Null pointer exception caught: " + e);

        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
