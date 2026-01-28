package assignment;

import java.io.*;
import java.util.Scanner;

/**
 * Ques: 3
 * Write a program to count number of occurrences of a word in a file.
 * The file name and word should be supplied through commandline.
* */
public class WordCount {

    public static void start(String filename, String wordToCount){

        WordCount wc = new WordCount();

//      return wc.usingScanner(filename, wordToCount);
        long count = wc.usingBufferedReader(filename, wordToCount);
        System.out.print(wordToCount+ " occurs : " + count + " times");
    }

//    Trying to read file usiing Scanner
    private long usingScanner(String filename, String wordToCount){
        long count = 0;
        String temp;
        try(Scanner scanner = new Scanner(new File(filename))) {
            scanner.useDelimiter("\\W+");

            while (scanner.hasNext()) {
                temp = scanner.next();
                if(temp.equals(wordToCount)){
                    count++;
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return count;
    }

    private long usingBufferedReader(String filename, String wordToCount){

        long count = 0;
        String line;
        String[] tmpWords;

        try(BufferedReader reader = new BufferedReader(new FileReader(filename))) {

            while((line = reader.readLine()) != null){
                tmpWords = line.split("\\W+");

                for(String words : tmpWords){
                    if(words.contains(wordToCount)){
                        count++;
                    }
                }
            }

        } catch (IOException e) {
            System.err.println("Error reading file: " + filename);
        }
        return count;
    }
}
