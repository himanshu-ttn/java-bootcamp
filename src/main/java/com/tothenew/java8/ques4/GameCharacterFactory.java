package com.tothenew.java8.ques4;

@FunctionalInterface
public interface GameCharacterFactory {

    GameCharacter create(String name, int lives );
}
