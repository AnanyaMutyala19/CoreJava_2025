package com.ananya.ArraysBySp;
//WAP  Find the index Where We can insert a new element.
public class BinarySearchImprovisation {
    public static void main(String[] args) {
        int arr[]={1,4,6,8,10};
        int target=9;
        int ans=bs(arr,target);
        System.out.println(ans);
    }

    private static int bs(int[] arr, int target) {
        int l=0;
        int r=arr.length-1;
        int mid=0;
        while(l<=r){
            mid=l+(r-l)/2;
            /*if(arr[mid]==target)
                return mid;*/
            if(arr[mid]>target)
                r=mid-1;
            else
                l=mid+1;
        }
        System.out.println("The values of l and r are:"+l+" "+r);
        return l;
    }
}
