package com.tothenew.intro_to_java_1.ques9;

public class CustomExceptionNoStackTrace extends Exception {

    public CustomExceptionNoStackTrace(String message) {
        super(message);
    }

    @Override
    public Throwable fillInStackTrace() {
        return this;
    }
}
