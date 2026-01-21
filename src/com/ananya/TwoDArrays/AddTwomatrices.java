package com.ananya.TwoDArrays;

import java.util.Arrays;
import java.util.Scanner;

//WAP to add two given matrices.
public class AddTwomatrices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int rowSize=sc.nextInt();
        int[][] arr1=new int[rowSize][];

        for(int i=0;i<rowSize;i++){
            System.out.println("Please enter the coulmn size of row :"+i);
            int colsize=sc.nextInt();
            arr1[i]=new int[colsize];
            System.out.println("Please enter the elements of row:"+i);
            for(int j=0;j<colsize;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i< arr1.length;i++) {
            System.out.println(Arrays.toString(arr1[i]));
        }

        //Taking input for array2
        System.out.println("Enter the size of an array");
        int rowSize2=sc.nextInt();
        int[][] arr2=new int[rowSize2][];

        for(int i=0;i<rowSize2;i++){
            System.out.println("Please enter the coulmn size of row :"+i);
            int colsize=sc.nextInt();
            arr2[i]=new int[colsize];
            System.out.println("Please enter the elements of row:"+i);
            for(int j=0;j<colsize;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i< arr2.length;i++) {
            System.out.println(Arrays.toString(arr2[i]));
        }
        //Third array which is sum of 2 arrays
        int[][] arr3=new int[arr1.length][];
        for(int i=0;i< arr3.length;i++){
            arr3[i]=new int[arr1.length];
            for(int j=0;j<arr1[i].length;i++){
                arr3[i][j]=arr1[i][j]+arr2[i][j];

            }
        }
        for(int i=0;i< arr3.length;i++){
            System.out.println(Arrays.toString(arr3[i]));
        }

    }
}
