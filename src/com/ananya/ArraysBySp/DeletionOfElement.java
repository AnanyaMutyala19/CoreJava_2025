package com.ananya.ArraysBySp;

import java.util.Arrays;

//WAP to delete an element from a specified position in a given array.
public class DeletionOfElement {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int indexpos=2;
        int[] newArr=new int[arr.length-1];
        int j=0;
        for(int i=0;i< arr.length;i++){
            if(i==indexpos){
                continue;
            }
            newArr[j]=arr[i];
            j++;
        }
        System.out.println("Array after deletion is :"+ Arrays.toString(newArr));
    }
}
