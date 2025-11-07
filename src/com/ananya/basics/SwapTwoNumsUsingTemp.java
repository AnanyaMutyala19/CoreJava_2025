package com.ananya.basics;

public class SwapTwoNumsUsingTemp {
    public static void main(String[] args) {
        int no1=24; int no2=21;
        int temp;
        /*temp=no1;
        no1=no2;
        no2=temp;
        System.out.println("After swaping numbers are:"+no1+" "+no2);*/
        no1=no1+no2;
        no2=no1-no2;
        no1=no1-no2;
        System.out.println("After swap:"+no1+" "+no2);



    }
}
