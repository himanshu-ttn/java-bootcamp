package com.tothenew.beyond_java_8.ques3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UnmodifiableListExample {

    public static void main(String[] args) {


        List<String> unmodifiable = Stream.of("Apple", "Bannana").toList();
        System.out.println(unmodifiable);


        List<String> unmodifiableThroughCollect = Stream.of("Math", "Science").collect(Collectors.toUnmodifiableList());
        System.out.println(unmodifiableThroughCollect);


        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");

        List<String> unmodifiableThroughCollect2 = fruits.stream().filter(f -> f.startsWith("A")).collect(Collectors.toUnmodifiableList());
        System.out.println(unmodifiableThroughCollect2);

    }
}
