package com.ananya.CollectionList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class PrintDupliacteElementsWithCount {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>(Arrays.asList("baby","ball","soap","shampoo",
                "chalk","soap","makeup","baby","lotion"));
        String[] arr=al.toArray(new String[0]);
        System.out.println(Arrays.toString(arr));
        HashMap<String,Integer> hm=new HashMap<>();
        for(int i=0;i< arr.length;i++){
            String curr=arr[i];
           hm.put(curr,hm.getOrDefault(curr,0)+1);
        }

        for(String val:hm.keySet()) {

            System.out.println(val + " " + hm.get(val));
        //    if
        }


    }
}
