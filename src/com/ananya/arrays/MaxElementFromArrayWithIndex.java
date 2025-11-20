package com.ananya.arrays;

import java.util.Scanner;

public class MaxElementFromArrayWithIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the length of array");
        int len=sc.nextInt();
        int[] arr=new int[len];
        int max=0;
        int largestNumberIndex=0;
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>max){
                max=arr[i];
                largestNumberIndex=i;
            }


        }
        System.out.println("Maximum number from array is :"+max+"at index "+largestNumberIndex);

    }
}
