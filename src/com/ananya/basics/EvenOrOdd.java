package com.ananya.basics;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Enter number to be evaluated as odd/even");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(number%2==0)
            System.out.println("Number is even");
        else
            System.out.println("Number is odd");
    }
}
