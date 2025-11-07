package com.ananya.basics;

public class Factorial {
    public static void main(String[] args) {
        int n=6;
        int mul=1;
        for(int i=1;i<=6;i++)
           mul=mul*i;
        System.out.println("Factorial of given number is:"+mul);
    }
}
