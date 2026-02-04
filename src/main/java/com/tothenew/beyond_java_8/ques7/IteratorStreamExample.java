package com.tothenew.beyond_java_8.ques7;

import java.util.stream.Stream;

/**
 * Use iterator stream method to generate a stream
 *
 */
public class IteratorStreamExample {

    static void main(String[] args) {

        Stream<Integer> numberStream = Stream.iterate(0, i -> i + 1).limit(100);

        numberStream.forEach(System.out::println);
    }
}

