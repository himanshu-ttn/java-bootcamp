package com.tothenew.intro_to_java_2.ques3;

import java.util.Scanner;

public class WordCountExample {

    static void main(String[] args) {


//         Through commandline
//        String word = args[1];
//        String filename = args[0];

        // Through user input
        Scanner scanner = new Scanner(System.in);
        String filename;
        String word;

        System.out.print("Enter the file name: ");
        filename = scanner.nextLine();

        System.out.print("Enter the word to count: ");
        word = scanner.nextLine();

        WordCount.start(filename, word);
    }
}
