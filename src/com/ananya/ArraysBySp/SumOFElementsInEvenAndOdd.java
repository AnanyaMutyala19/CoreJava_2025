package com.ananya.ArraysBySp;

import java.util.Arrays;
import java.util.Scanner;

//WAP to calculate the sum of even and odd numbers separately in a given array.
public class SumOFElementsInEvenAndOdd {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int evenSum=0;
        int oddSum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evenSum+=arr[i];
            }
            else
                oddSum+=arr[i];
        }
        System.out.println("Input array is:"+ Arrays.toString(arr));
        System.out.println("Even numbers in array sum is :"+evenSum);
        System.out.println("Odd numbers in array sum is:"+oddSum);



    }
}
