package com.tothenew.intro_to_java_2.ques2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * :: This class is part of ques 2
 * this class is acting as a middleware to perform actions
 *
 * @see User
 */
public class UserCreation {

    private final String filename = "userdata.txt";
    private Scanner sc;

    public UserCreation() {
        sc = new Scanner(System.in);
    }

    private void promptMenu() {
        System.out.print("Do you want to create a new user? [yes/no] ");
        System.out.print("Enter QUIT to exit.");
    }

    private boolean saveUserToFile(User user) {

        try (FileWriter writer = new FileWriter(filename, true)) {

            writer.write(user.toString() + System.lineSeparator());

        } catch (IOException e) {
            System.out.println("Error writing to file" + e.getMessage());
            return false;
        }
        return true;
    }

    private void createUser() {
        try {

            System.out.print("Enter First Name: ");
            String firstname = sc.nextLine();

            System.out.print("Enter Last Name: ");
            String lastname = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = Integer.parseInt(sc.nextLine());

            System.out.print("Enter Phone Number: ");
            String phonenumber = sc.nextLine();

            User user = new User(firstname, lastname, age, phonenumber);

            if (saveUserToFile(user)) {
                System.out.println("User created successfully.");
            }

        } catch (Exception e) {
            System.out.println("Error in creating user");
        }
    }


    public void startProgram() {
        String typed;
        while (true) {
            promptMenu();
            typed = sc.nextLine();

            if (typed.equalsIgnoreCase("yes")) {
                createUser();
            } else if (typed.equalsIgnoreCase("no") || typed.equalsIgnoreCase("QUIT")) {
                System.out.println("Quiting program");
                sc.close();
                break;
            } else {
                System.out.println("Invalid input");
            }

        }
        sc.close();
    }
}
