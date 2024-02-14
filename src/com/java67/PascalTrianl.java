package com.java67;

import java.util.Scanner;

class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the triangle");
        int rows = sc.nextInt();
        printPascalTriangle(rows);
    }

    private static void printPascalTriangle(int rows) {
        int[] arr = new int[2 * rows + 1];
        arr[rows] = 1;

        System.out.print("    1");
        System.out.print("\n");

        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                // System.out.println(" ");
            }


        }


    }
}
