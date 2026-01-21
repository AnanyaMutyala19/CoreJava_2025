package com.ananya.TwoDArrays;

import java.util.Arrays;
import java.util.Scanner;

//WAP to calculate the sum of all elements in a given 2D array.
public class SumOfElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int rowSize=sc.nextInt();
        int[][] arr=new int[rowSize][];
        int sum=0;
        for(int i=0;i<rowSize;i++){
            System.out.println("Please enter the coulmn size of row :"+i);
            int colsize=sc.nextInt();
            arr[i]=new int[colsize];
            System.out.println("Please enter the elements of row:"+i);
            for(int j=0;j<colsize;j++){
                arr[i][j]=sc.nextInt();
                sum+=arr[i][j];
            }

        }
        for(int i=0;i< arr.length;i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("Sum of elements in array is :"+sum);
        sc.close();



    }
}
