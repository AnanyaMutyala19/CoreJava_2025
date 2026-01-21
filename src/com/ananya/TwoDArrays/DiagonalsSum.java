package com.ananya.TwoDArrays;

import java.util.Scanner;

//WAP to compute the sum of the diagonals of a given matrix.
public class DiagonalsSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of square matrix :");
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        System.out.println("Enter element for array");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        //print the elements in array
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        int sumL=0;int sumR=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j)
                    sumL+=arr[i][j];
                if(i+j==n-1)
                    sumR+=arr[i][j];
            }
        }
        System.out.println("Sum of diagonal elements is:"+(sumL+sumR));


    }
}
