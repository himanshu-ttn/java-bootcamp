package com.tothenew.collections.ques3;

public class StackExample {
    static void main(String[] args) {
        SpecialStack stack = new SpecialStack(10);

        stack.push(5);
        stack.push(2);
        stack.push(8);
        stack.push(1);
        stack.push(3);

        System.out.println("Minimum: " + stack.getMin()); // 1

        stack.pop();
        stack.pop();

        System.out.println("Minimum after pops: " + stack.getMin());
    }
}
