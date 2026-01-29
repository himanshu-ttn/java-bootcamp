package com.tothenew.intro_to_java_2.ques5;

public class SystemManger {

    private static SystemManger instance;
    private String log;

    private SystemManger() {
        System.out.println("SystemManger initialized");
    }

    // method to provide the single instance of manager
    public static SystemManger getInstance() {

        if (instance == null) {
            instance = new SystemManger();
        }
        return instance;
    }

    public void log(String message) {
        this.log = message;
        System.out.println("LOG: " + message);
    }

    public String getLog() {
        return log;
    }

    public void shutdownSystem() {
        System.out.println("System is shutting down...");
    }
}
