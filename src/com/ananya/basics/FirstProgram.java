package com.ananya.basics;

import java.util.Scanner;

public class FirstProgram {
    public static void main(String[] args) {
            //Even or odd
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to check even or odd:");
        int number=sc.nextInt();
        if(number%2==0)
            System.out.println("Number is even");
        else
            System.out.println("Number is odd");

        //print student result based on grading
        System.out.println("Enter marks of student");
        int marks=sc.nextInt();
        if(marks<35)
            System.out.println("FAIL");
        else if (marks==35)
            System.out.println("PASS");
        else if (marks>35 && marks<70)
            System.out.println("THIRD CLASS");
        else if (marks>=70 && marks <85)
            System.out.println("SECOND CLASS");
        else
            System.out.println("FIRST CLASS");

        }


    }

