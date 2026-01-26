package org.example;

// Ques: 2
// Write a program to read user input until user writes XDONE and then show the entered text by the user on command line

import java.util.Scanner;

public class UserInput {

    private final Scanner scanner ;

    public UserInput(){
        scanner = new Scanner(System.in);
    }

    public boolean start() {
        String word;


        while(true) {

            word = scanner.nextLine();

            if( word.equals("XDONE") ) {
                System.out.println("Bye!");
                break;
            }
        }
        return true;
    }
}
