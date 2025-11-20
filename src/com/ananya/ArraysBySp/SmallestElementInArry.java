package com.ananya.ArraysBySp;
//WAP to find the smallest element in a given array.
public class SmallestElementInArry {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,-1};
        int smallestElement=arr[0];
        int index=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]<smallestElement){
                smallestElement=arr[i];
                index=i;
            }
        }
        System.out.println("Smallest element in array is :"+smallestElement+"found at index :"+index);
    }
}
