package com.ananya.ArraysBySp;
//WAP to find the largest element in a given array.
public class LargestElementInArray {
    public static void main(String[] args) {
        int[] arr={10,60,15,22,0};
        int maxElement=arr[0];
        int index=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>maxElement){
                maxElement=arr[i];
                index=i;
            }
        }
        System.out.println("Maximum element in array is :"+maxElement+"found at index i :"+index);
    }
}
