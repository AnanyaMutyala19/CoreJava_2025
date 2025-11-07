package com.ananya.basics;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        int no1=10,no2=1,no3=90;
        if(no1>no2 && no1>no3)
            System.out.println("No1 is greater");
        else if(no2>no1 && no2>no3)
            System.out.println("No 2 is greater");
        else
            System.out.println("No 3 is greater");
    }
}
