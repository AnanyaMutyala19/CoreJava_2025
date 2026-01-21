package com.ananya.TwoDArrays;

import java.util.Arrays;
import java.util.Scanner;

//WAP to copy all elements of one 2D array into another 2D array.
public class CopyElementsFromOneToAnother {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int rowSize=sc.nextInt();
        int[][] arr=new int[rowSize][];

        for(int i=0;i<rowSize;i++){
            System.out.println("Please enter the coulmn size of row :"+i);
            int colsize=sc.nextInt();
            arr[i]=new int[colsize];
            System.out.println("Please enter the elements of row:"+i);
            for(int j=0;j<colsize;j++){
                arr[i][j]=sc.nextInt();

            }
        }
        for(int i=0;i< arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }




    }

}
