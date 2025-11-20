package com.ananya.ArraysBySp;

import java.util.Arrays;
import java.util.Scanner;

//WAP to calculate the sum of all elements in a given array.
public class SumOfElementsInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter length of array:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        int sum=0;
        System.out.println("Please enter elements of array:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        System.out.println("Input Array is :"+ Arrays.toString(arr)+"and sum of elements in array is:"+sum);
       sc.close();
    }
}
