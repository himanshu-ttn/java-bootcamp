package com.tothenew.intro_to_java_1.ques9;

public class ExceptionWIthNoStackTrace {
    static void main(String[] args) {
        try {
            throw new CustomExceptionNoStackTrace("HEHE This is custom exception");
        } catch (CustomExceptionNoStackTrace e) {
            System.out.println(e.getMessage());
            e.printStackTrace(System.out);
        }
    }
}
