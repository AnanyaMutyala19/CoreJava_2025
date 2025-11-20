package com.ananya.ArraysBySp;

import java.util.Scanner;

//WAP to search for a specific element in a given array.
public class SearchForSpecificElementInArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter element you want from array");
        int j=sc.nextInt();
        int index=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==j){
                index=i;
                System.out.println("Element is found at index from array at pos: "+index);
                break;
            }
        }

    }
}
