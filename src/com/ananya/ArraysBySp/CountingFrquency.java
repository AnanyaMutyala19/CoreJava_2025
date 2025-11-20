package com.ananya.ArraysBySp;

import java.util.HashMap;

//WAP to print duplicates in array
public class CountingFrquency {
    public static void main(String[] args) {
        int[] arr={1,2,1,2,2,1,4,3,4};
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i< arr.length;i++){
            int current=arr[i];
            if(hm.containsKey(current)){
                int prev=hm.get(current);
                hm.put(current,prev+1);
            }
            else
                hm.put(current,1);
        }
        for(int i: hm.keySet())
            System.out.println(i+" "+hm.get(i));
    }
}
