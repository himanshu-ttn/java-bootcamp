package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

//    static {
//        System.out.println("\n:: STATIC-BLOCK :: ");
//        Person temp = new Person("Himanshu", "Verma", 99);
//        temp.printData();
//    }

    static void main() {

//      :: code for ques: 1 ::
/*
        System.out.println("\n:: STATIC-FUNCTION :: ");

        Person tmp = Person.getInstance("Kartik", "Sharma", 80);

        Person.Showdata(tmp);


        System.out.println("\n :: STATIC-VARIABLE :: ");

        Person.FirstName = "Virat";
        Person.LastName = "Kohli";
        Person.Age = 28;

        System.out.println("First Name: " + Person.FirstName);
        System.out.println("Last Name: " + Person.LastName);
        System.out.println("Age : " + Person.Age);

*/

//      :: code for ques : 2 ::
/*
        UserInput userInput = new UserInput();
        userInput.start();
        System.out.println("Exiting the program");
*/


//      :: code for ques : 3 ::
/*
        Menu menu =  new Menu();
        menu.showMenu();
        Menu.CalculateCircumference();
        Menu.CalculateArea();
        */

//        :: code for ques : 4 ::
//        twoDimension();


//        :: code for ques : 5 ::
/*

        Employee employee1 = new Employee();
        Employee employee2 = new Employee("Himanshu", "verma", (short) 25, "Software Developer Trainee");
        Employee employee3 = new Employee("Sonu", "Gupta", (short) 25);
        Employee employee4 = new Employee(employee1);

        employee1.toString();
        employee2.toString();
        employee3.toString();
        employee4.toString();

*/

//        :: code for ques : 6 ::
/*
        SBI sbi = new SBI("Noida SBI", "Mumbai Office", "XYZ", 541, 6.2, 9.5, 7.3, 10000);
        Bank x = new ICICI("Noida ICICI", "Mumbai Office", "ABC", 451, 4.5, 10.5, 8.6, 50000);
        BOI boi = new BOI("Delhi BOI", "Delhi Main Offic", "MNO", 651, 4.5, 10.5, 8.6, 25000);

        System.out.println(sbi.toString());
        System.out.println(x.toString());
        System.out.println(boi.toString());
*/

//        :: code for ques : 7 ::
//        MultiTryCatch();

//        :: code for ques : 8 ::
//        ProduceException();

//        :: code for ques : 9 ::
        try{
            throw new CustomExceptionNoStackTrace("HEHE This is custom exception");
        }
        catch (CustomExceptionNoStackTrace e){
            System.out.println(e.getMessage());
            e.printStackTrace(System.out);
        }


    }


    private static void twoDimension() {

//        int[][] arr = {
//                {42,  7,  89, 16, 55},
//                {3,  68, 24, 91, 10},
//                {77, 14, 6,  38, 62},
//                {19, 85, 47, 2,  73},
//                {58, 11, 94, 26, 31}
//        };

        Scanner sc = new Scanner(System.in);
        int row, col;
        int totalSum = 0;

        System.out.println("Please the size of 2d array: ");
        System.out.print("Enter the row: ");
        row = sc.nextInt();
        System.out.print("Enter the columns: ");
        col = sc.nextInt();

        int[][] array = new int[row][col];
        int[] rowSum = new int[row];
        int[] colSum = new int[col];

        System.out.print("\nEnter data for 2d array: ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("(" + (i + 1) + "," + (j + 1) + "): ");
                array[i][j] = sc.nextInt();
                rowSum[i] += array[i][j];
                colSum[j] += array[i][j];
            }
            totalSum += rowSum[i];
        }

        System.out.println("sum of all elements of each column: " + Arrays.toString(colSum));
        System.out.println("sum of all elements of each row: " + Arrays.toString(rowSum));
        System.out.println("Sum of all element of 2d array: " + totalSum);
    }

    private static void MultiTryCatch() {

        int[] numbers = {10, 0, 5};
        int[] array = null;


        try {
            int result = numbers[0] / numbers[1];
            System.out.println("Result: " + result);

            System.out.println("Printing array lenght " + array.length);

            System.out.println("Accessing invalid index: " + numbers[5]);

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occurred: " + e);

        } catch (NullPointerException e) {
            System.out.println("Null pointer exception caught: " + e);

        } finally {
            System.out.println("Finally block executed.");
        }
    }

    private static void ProduceException() {
        try {
            Class.forName("org.example.Boxed");
        } catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException: " + ex);
        }

        try {
            throw new NoClassDefFoundError("NoClassDefFoundError BLAH BLAH");
        } catch (NoClassDefFoundError ex) {
            System.out.println("NoClassDefFoundError: " + ex);
        }
    }

}
