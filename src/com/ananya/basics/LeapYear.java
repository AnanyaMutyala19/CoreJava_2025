package com.ananya.basics;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter year to check leap/not");
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(year%400==0||year%4==0& year%100!=0)
            System.out.println("Its a leap year");
        else
            System.out.println("Not a leap year");

    }
}
