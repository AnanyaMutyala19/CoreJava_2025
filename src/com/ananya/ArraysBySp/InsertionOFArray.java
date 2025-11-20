package com.ananya.ArraysBySp;

import java.util.Arrays;
import java.util.Scanner;

//WAP to insert an element at a specified position in a given array.
public class InsertionOFArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int indexpos=2;
        int element=100;
        int[] newArr=new int[arr.length+1];
        for(int i=0;i<=indexpos-1;i++){
            newArr[i]=arr[i];
        }
        newArr[indexpos]=element;
        for(int i=indexpos;i<arr.length;i++){
            newArr[i+1]=arr[i];
        }
        System.out.println("Array After insertions is:"+ Arrays.toString(newArr));




    }
}
