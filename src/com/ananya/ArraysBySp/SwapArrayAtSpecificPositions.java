package com.ananya.ArraysBySp;

import java.util.Arrays;
import java.util.Scanner;

//WAP to swap two elements in a given array at specified positions.
public class SwapArrayAtSpecificPositions {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter indexes of elements to be swapped in array");
        int pos1=sc.nextInt();
        int pos2=sc.nextInt();
        int temp=0;
        arr[pos1]=arr[pos1]+arr[pos2];
        arr[pos2]=arr[pos1]-arr[pos2];
        arr[pos1]=arr[pos1]-arr[pos2];
        System.out.println("Array After swapping indexes is: "+ Arrays.toString(arr));

    }
}
