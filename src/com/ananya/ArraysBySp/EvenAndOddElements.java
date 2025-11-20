package com.ananya.ArraysBySp;

import java.util.Scanner;

//WAP to count the number of even and odd elements in a given array.
public class EvenAndOddElements {
    public static void main(String[] args) {
        int[] arr={12,89,1,9,10};
        int evenCount=0;
        int oddCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evenCount++;
            }
        }
        oddCount=arr.length-evenCount;
        System.out.println("Number of even elements in array is:"+evenCount+"and odd elements count in array"+oddCount);

    }
}
