package com.ananya.basics;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number to be reversed");
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        int revNum=0;
        while(input!=0) {
            int rem=input%10;
            revNum=revNum*10+rem;
            input=input/10;
        }
        System.out.println("Reversed Number is:"+revNum);

    }
}
