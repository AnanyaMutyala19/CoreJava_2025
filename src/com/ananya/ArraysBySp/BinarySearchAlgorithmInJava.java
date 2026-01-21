package com.ananya.ArraysBySp;

public class BinarySearchAlgorithmInJava {

    public static void main(String[] args) {
        int arr[]={1,4,6,8,10};
        int target=10;
        int ans=bs(arr,target);
        System.out.println(ans);
    }

    private static int bs(int[] arr, int target) {
        int l=0;
        int r= arr.length-1;
        int mid=0;
        while(l<=r){
            mid=(l+r)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]>target)
                r=mid-1;
            else
                l=mid+1;
        }
        return -1;

    }
}
