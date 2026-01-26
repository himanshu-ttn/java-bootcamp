package org.example;

public class CustomExceptionNoStackTrace extends Exception {

    public CustomExceptionNoStackTrace(String message) {
        super(message);
    }

    @Override
    public Throwable fillInStackTrace() {
        return this;
    }
}
