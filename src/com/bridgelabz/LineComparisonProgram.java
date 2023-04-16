package com.bridgelabz;

import java.util.Scanner;

public class LineComparisonProgram {
    public static void main(String[] args) {
        System.out.println("*** Welcome to LINE COMPARISON COMPUTATION PROGRAM ***");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of x1 = ");
        int x1 = scanner.nextInt();
        System.out.print("Enter the value of y1 = ");
        int y1 = scanner.nextInt();
        System.out.print("Enter the value of x2 = ");
        int x2 = scanner.nextInt();
        System.out.print("Enter the value of y2 = ");
        int y2 = scanner.nextInt();
        double lengthOfLine;

        lengthOfLine = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));

        System.out.println("The Length of a Line = " +lengthOfLine);

    }
}
