package com.bridgelabz;

import java.util.Scanner;

public class LineComparisonProgram {

    int x1,x2,y1,y2,x3,x4,y3,y4;
    double lengthOfLine1;
    double lengthOfLine2;
    public void lengthOfLine1(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of x1 = ");
        int x1 = scanner.nextInt();
        System.out.print("Enter the value of y1 = ");
        int y1 = scanner.nextInt();
        System.out.print("Enter the value of x2 = ");
        int x2 = scanner.nextInt();
        System.out.print("Enter the value of y2 = ");
        int y2 = scanner.nextInt();

        lengthOfLine1 = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        System.out.println("The Length of a Line = " +lengthOfLine1);
    }
    public void lengthOfLine2(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of x3 = ");
        int x3 = scanner.nextInt();
        System.out.print("Enter the value of y3 = ");
        int y3 = scanner.nextInt();
        System.out.print("Enter the value of x4 = ");
        int x4 = scanner.nextInt();
        System.out.print("Enter the value of y4 = ");
        int y4 = scanner.nextInt();

        lengthOfLine2 = Math.sqrt(Math.pow((x4-x3),2) + Math.pow((y4-y3),2));
        System.out.println("The Length of a Line = " +lengthOfLine2);
    }
    public void EqualMethod(){

        String line1 = String.valueOf(lengthOfLine1);
        String line2 = String.valueOf(lengthOfLine2);

        if (line1.equals(line2))
            System.out.println("Two Lines are EQUAL");
        else
            System.out.println("Two Lines are NOT Equal");
    }
    public void CompareToMethod(){

        String line1 = String.valueOf(lengthOfLine1);
        String line2 = String.valueOf(lengthOfLine2);

        if (line1.compareTo(line2) == 0)
            System.out.println("Two Lines are EQUAL");
        else if (line1.compareTo(line2) > 0)
            System.out.println("Line1 is GREATER Than Line2");
        else if (line1.compareTo(line2) < 0)
            System.out.println("Line1 is LESSER Than Line2");
    }
    public static void main(String[] args) {

        System.out.println("*** Welcome to LINE COMPARISON COMPUTATION PROGRAM ***");

        LineComparisonProgram lineComparisonProgram = new LineComparisonProgram();
        lineComparisonProgram.lengthOfLine1();
        lineComparisonProgram.lengthOfLine2();
        lineComparisonProgram.EqualMethod();
        lineComparisonProgram.CompareToMethod();
    }
}
