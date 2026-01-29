package com.tothenew.collections.ques3;

import java.util.Stack;

/**
 * class for ques 3:
 * using 2 stack to maintain minimum value :
 * like if the inserted item is smaller than top item in 2nd stack we insert it in the min stack as its maintianing the previous min item
 * that help in O(1);
 *
 *
 */
public class SpecialStack {

    private Stack<Integer> mainStack;
    private Stack<Integer> minStack;
    private int capacity;

    public SpecialStack(int capacity) {
        this.capacity = capacity;
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }


    public boolean isFull() {
        return mainStack.size() == capacity;
    }


    public boolean isEmpty() {
        return mainStack.isEmpty();
    }


    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow!");
            return;
        }

        mainStack.push(value);

        // Update min stack
        if (minStack.isEmpty() || value <= minStack.peek()) {
            minStack.push(value);
        }
    }


    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        }

        int removed = mainStack.pop();

        if (removed == minStack.peek()) {
            minStack.pop();
        }

        return removed;
    }


    public int getMin() {
        if (minStack.isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return minStack.peek();
    }
}
