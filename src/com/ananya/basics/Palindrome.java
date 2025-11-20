package com.ananya.basics;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a number to check palindrome");
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        int originalNum=input;
        int rev=0;
        int rem=0;
        while(input!=0)
        {
            rem=input%10;
            rev=rev*10+rem;
            input=input/10;

        }
        System.out.println("Reverse of a number is:"+rev);
        if(rev==originalNum)
            System.out.println("Number is palindrome");
        else
            System.out.println("Number is not a plaindrome");
    }
}
