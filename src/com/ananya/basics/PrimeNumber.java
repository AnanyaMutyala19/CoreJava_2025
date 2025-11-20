package com.ananya.basics;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number to check prime/not");
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        int count=0;
        for(int i=1;i<=input;i++){
            if(input%i==0)
                count++;

        }
        if(count<=2)
            System.out.println("Number is prime");
        else
            System.out.println("Not a prime number");

    }
}
