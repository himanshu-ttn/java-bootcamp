package com.tothenew.intro_to_java_1.ques3;

import java.util.Scanner;

/**
 * Ques: 3
 * Write a java program to show following menu to the user:
 * <p>
 * ******Menu*******
 * 1. Calculate Area of Circle
 * 2. Calculate Circumference of a Circle
 * 3. Exit.
 * Choose an option (1-3):
 * <p>
 * Take radius as user input.
 * <p>
 * Hint: Use Switch statement to act on the menu. Also area and circumference methods should be static
 *
 *
 */
public class Menu {

    public static final float PI = 3.14f;

    private void PrintMenu() {
        System.out.println("\n*******Menu*******");
        System.out.println("1. Calculate Area of Circle");
        System.out.println("2. Calculate Circumference of a Circle");
        System.out.println("3. Exit.");
        System.out.println("Choose an option (1-3):");
    }

    public static float getRadius() {
        Scanner scanner = new Scanner(System.in);
        float radius;
        System.out.print("Enter radius of Circle: ");
        radius = scanner.nextFloat();
        return radius;
    }

    public static void CalculateArea() {
        float radius = getRadius();
        System.out.println("Area of Circle: " + (PI * (radius * radius)));
    }

    public static void CalculateCircumference() {
        float radius = getRadius();
        System.out.println("Circumference of Circle: " + (2 * PI * radius));
    }

    public void showMenu() {

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {

            PrintMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Menu.CalculateArea();
                    break;
                case 2:
                    Menu.CalculateCircumference();
                    break;
                case 3:
                    System.out.println("You pressed 3.");
                    System.out.println("Exiting... ");
                    return;

                default:
                    System.out.println("Invalid choice.");
                    break;
            }

        } while (true);

    }
}
