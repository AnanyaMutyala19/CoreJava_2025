package com.ananya.TwoDArrays;

import java.util.Arrays;
import java.util.Scanner;

public class TransposeOfMatrix {
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
        int[][] transpose=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                transpose[j][i]=arr[i][j];
            }
        }
        for(int i=0;i< transpose.length;i++){
            System.out.println(Arrays.toString(transpose[i]));
        }


    }
}
