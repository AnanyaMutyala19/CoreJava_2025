package com.ananya.ArraysBySp;
//WAP to count the number of positive, negative, and zero elements in a given array.
public class PositiveAndNegative {
    public static void main(String[] args) {
        int[] arr={10,20,-10,-2,0};
        int positiveCount=0;
        int negativeCount=0;
        int zeroCount=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>0)
                positiveCount++;
            else if (arr[i]<0)
                negativeCount++;
            else
                zeroCount++;
                
        }
        System.out.println("Number of elements that is postive ,negative and zero elements in array are:"+positiveCount+" "+negativeCount+" "+zeroCount);
    }
}
