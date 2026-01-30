package com.tothenew.java8.ques4;

public class GameCharacter {
    private String name;
    private int lives;

    public GameCharacter(String name, int powerLevel) {
        this.name = name;
        this.lives = powerLevel;
    }

    void display() {
        System.out.println("Character: " + name + ", Power Level: " + lives);
    }
}
