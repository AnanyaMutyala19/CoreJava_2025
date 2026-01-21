package com.ananya.ArraysBySp;

public class RightmostElementInSortedArray {
    public static void main(String[] args) {
        int arr[]={1,2,2,2,3,4};
        int target=5;
        int ans=rightMostElement(arr,target);
        System.out.println("Rightmost element of "+target+" is at index "+ans);
    }

    private static int rightMostElement(int[] arr, int target) {
        int l=0;
        int r= arr.length-1;
        int mid=0;
        while(l<=r){
            mid=l+(r-l)/2;
            if(arr[mid]>target){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        if(r<0)
            return -1;
        if(arr[r]!=target)
            return -1;

       return r;
    }
}
