package com.tothenew.beyond_java_8.ques10;

import java.util.*;

/**
 * Demonstrate the use of  addFirst(), addLast, removeFirst(), removeLast, getFirst(), getLast(), reversed() in Set and List Sequenced collections
 * */

public class SequenceExample {
    public static void main(String[] args) {


        // -------------------------------
        // Sequenced List
        // -------------------------------
        SequencedCollection<String> list = new LinkedList<>();

        list.addFirst("Alice");
        list.addLast("Bob");
        list.addLast("Charlie");
        System.out.println("Sequenced List: " + list);

        System.out.println("List first element: " + list.getFirst());
        System.out.println("List last element: " + list.getLast());

        list.removeFirst();
        list.removeLast();
        System.out.println("List after removeFirst/removeLast: " + list);

        System.out.println("List in reversed order: " + list.reversed());

        // -------------------------------
        // Sequenced Set
        // -------------------------------
        SequencedCollection<String> set = new LinkedHashSet<>();

        set.addFirst("Alice");
        set.addLast("Bob");
        set.addLast("Charlie");
        System.out.println("\nSequenced Set: " + set);

        System.out.println("Set first element: " + set.getFirst());
        System.out.println("Set last element: " + set.getLast());

        set.removeFirst();
        set.removeLast();
        System.out.println("Set after removeFirst/removeLast: " + set);

        System.out.println("Set in reversed order: " + set.reversed());
    }
}
