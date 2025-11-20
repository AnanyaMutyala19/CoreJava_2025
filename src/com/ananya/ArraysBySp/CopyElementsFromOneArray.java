package com.ananya.ArraysBySp;

import java.util.Arrays;

//WAP to copy the contents of one array into another array.
public class CopyElementsFromOneArray {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int[] arr2=new int[arr1.length];
        for(int i=0;i< arr1.length;i++){
            arr2[i]=arr1[i];

        }
        System.out.println("Copied array from one to another is:"+ Arrays.toString(arr2));



    }
}
