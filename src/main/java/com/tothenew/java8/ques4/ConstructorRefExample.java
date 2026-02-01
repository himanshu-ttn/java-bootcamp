package com.tothenew.java8.ques4;

public class ConstructorRefExample {
    static void main(String[] args) {

        GameCharacterFactory characterFactory = GameCharacter::new;

        GameCharacter brim = characterFactory.create("Brim", 3);
        GameCharacter jett = characterFactory.create("Jett", 5);

        brim.display();
        jett.display();
    }
}
