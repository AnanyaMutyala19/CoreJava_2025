package com.ananya.basics;

public class Calculator {
    public static void main(String[] args) {
        int no1=9;int no2=30;
        char operator='$';
        switch(operator){
            case '+':
                System.out.println(no1+no2);
                break;
            case '-':
                System.out.println(no1-no2);
                break;
            case '*':
                System.out.println(no1*no2);
                break;
            case '/':
                System.out.println(no1/no2);
                break;
            default:
                System.out.println("Not a valid operator");

        }
    }
}
