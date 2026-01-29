package com.tothenew.intro_to_java_1.ques8;

public class ProducExceptionExample {
    static void main(String[] args) {
        try {
            Class.forName("com.tothenew.hello");
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException: " + ex);
        }

        try {
            // for NoClassDefFoundError to trigger ::
            // we have to delete or remove the .class file for this or the file we want to access
            // so just throwing the exception;
            throw new NoClassDefFoundError("NoClassDefFoundError BLAH BLAH");
        } catch (NoClassDefFoundError ex) {
            System.out.println("NoClassDefFoundError: " + ex);
        }
    }
}
