package com.goncoG1T.application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the number of lines: ");
        int line = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int column = sc.nextInt();

        int[][] matrix = new int[line][column];

        System.out.println("\n**** Inserting data ****");
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("At line %d, column %d: ",i,j);
                matrix[i][j] = sc.nextInt();
            }
        }



        System.out.print("\nChoose a number to be found: ");
        int chosenNumber = sc.nextInt();
        boolean flag = false;

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {

              if(matrix[i][j] == chosenNumber){
                  flag = true;
                  System.out.printf("\nFound!\nAt: line %d, column %d.",i, j);

                  if(j-1 >= 0) {
                          System.out.print("\nNumber on the Left: " + matrix[i][j-1]);
                  }
                  if(j+1 < matrix.length) {
                        System.out.print("\nNumber on the right: " + matrix[i][j+1]);
                  }
                  if(i-1 >= 0) {
                      System.out.print("\nNumber above: " + matrix[i-1][j]);
                  }
                  if(i+1 < matrix.length) {
                      System.out.print("\nNumber below: " + matrix[i+1][j]);
                  }
                  System.out.println();
              }
            }
        }

        if (!flag){
            System.out.println("\nNumber not found!");
        }
    }
}
