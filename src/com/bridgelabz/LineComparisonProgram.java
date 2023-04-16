package com.bridgelabz;

import java.util.Scanner;

public class LineComparisonProgram {
    public static void main(String[] args) {
        System.out.println("*** Welcome to LINE COMPARISON COMPUTATION PROGRAM ***");
//UC1
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of x1 = ");
        int x1 = scanner.nextInt();
        System.out.print("Enter the value of y1 = ");
        int y1 = scanner.nextInt();
        System.out.print("Enter the value of x2 = ");
        int x2 = scanner.nextInt();
        System.out.print("Enter the value of y2 = ");
        int y2 = scanner.nextInt();
        double lengthOfLine1;

        lengthOfLine1 = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        System.out.println("The Length of a Line = " +lengthOfLine1);
//UC2
        System.out.print("Enter the value of x3 = ");
        int x3 = scanner.nextInt();
        System.out.print("Enter the value of y3 = ");
        int y3 = scanner.nextInt();
        System.out.print("Enter the value of x4 = ");
        int x4 = scanner.nextInt();
        System.out.print("Enter the value of y4 = ");
        int y4 = scanner.nextInt();
        double lengthOfLine2;
        lengthOfLine2 = Math.sqrt(Math.pow((x4-x3),2) + Math.pow((y4-y3),2));
        System.out.println("The Length of a Line = " +lengthOfLine2);

        String line1 = String.valueOf(lengthOfLine1);
        String line2 = String.valueOf(lengthOfLine2);
        if (line1.equals(line2))
            System.out.println("Two Lines are EQUAL");
        else
            System.out.println("Two Lines are NOT Equal");
    }
}
