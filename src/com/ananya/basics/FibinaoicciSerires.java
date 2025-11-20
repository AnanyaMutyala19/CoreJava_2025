package com.ananya.basics;

public class FibinaoicciSerires {
    public static void main(String[] args) {
        int no1=0;
        int no2=1;
        System.out.println("Fibonacci series of range 1 to 100 is:");
        System.out.print(no1+" "+no2);
        int sum=0;
        for(int i=2;i<=100;i++){
            sum=no1+no2;
            System.out.print(" "+sum);
            no1=no2;
            no2=sum;
        }

    }
}
