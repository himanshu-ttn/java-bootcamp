package com.tothenew.java8.ques7;

import java.util.Arrays;
import java.util.List;

public class StreamSumExample {
    static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 1, 10, 5, 7);

        int sum = numbers.stream()
                .filter(n -> n > 5)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum of numbers greater than 5: " + sum);
    }
}
