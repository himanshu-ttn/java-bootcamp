package com.tothenew.beyond_java_8.ques11;

import java.util.LinkedHashMap;
import java.util.SequencedMap;

/**
 * Demonstrate the use of firstEntry(), lastEntry(), pollFirstEntry(), pollLastEntry(), putFirst(), putLast(), reversed() with SequencedMap.
 * */

public class SequencedMapExample {


    public static void main(String[] args) {

        // Create a SequencedMap using LinkedHashMap (Java 21)
        SequencedMap<Integer, String> map = new LinkedHashMap<>();

        // Add entries at the start and end
        map.putFirst(1, "Alice");
        map.putLast(2, "Bob");
        map.putLast(3, "Charlie");

        System.out.println("Original SequencedMap: " + map);

        // Access first and last entries
        System.out.println("First entry: " + map.firstEntry());
        System.out.println("Last entry: " + map.lastEntry());

        // Remove first and last entries (poll)
        map.pollFirstEntry();
        map.pollLastEntry();
        System.out.println("Map after pollFirstEntry/pollLastEntry: " + map);

        // Reverse view of the map
        System.out.println("Reversed map: " + map.reversed());
    }
}
