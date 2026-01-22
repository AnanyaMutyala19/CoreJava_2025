package com.ananya.ArraysBySp;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int nums[]={3,2,3};
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i< nums.length;i++){
            int current=nums[i];
            if(hm.containsKey(current)){
                int prev=hm.get(current);
                hm.put(current,prev+1);
            }
            else{
                hm.put(current,1);
            }
        }

       // for(int )
    }
}
