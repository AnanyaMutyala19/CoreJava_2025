package com.ananya.ArraysBySp;

import java.util.Arrays;

//WAP to reverse the elements of a given array.
public class ReverseElementsInArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] revArr=new int[arr.length];
        for(int i=0;i< arr.length;i++){
            revArr[arr.length-i-1]=arr[i];
        }
        System.out.println("Reversed Array is :"+ Arrays.toString(revArr));


    }
}
