package com.tothenew.intro_to_java_1.ques4;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionExample {

    public static void main(String[] args) {

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

}
