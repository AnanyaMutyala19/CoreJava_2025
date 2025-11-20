package com.ananya.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BaiscsOfArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("please enter elements of array");
        int sum=0;
        int avg=0;
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        avg=sum/ arr.length;

        System.out.println("Input string is:"+ Arrays.toString(arr)+"and sum is :"+sum);
        System.out.println("Average of numbers is:"+avg);
    }
}
