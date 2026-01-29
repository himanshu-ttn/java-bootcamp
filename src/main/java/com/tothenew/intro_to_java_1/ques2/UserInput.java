package com.tothenew.intro_to_java_1.ques2;

import java.util.Scanner;

/**
 * Ques: 2
 * Write a program to read user input until user writes XDONE and then show the entered text by the user on command line
 *
 */

public class UserInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word;

        while (true) {

            word = scanner.nextLine();


            if (word.equals("XDONE")) {
                System.out.println("Bye!");
                break;
            }
        }

        System.out.println("Exiting the program");
    }

}
