package com.ananya.StringsBySP;

import java.util.*;

//WAP to find the maximum and minimum occurring character in a String
public class MaxAndMinCharcaterInString {
    public static void main(String[] args) {
        String input="Ananya";
        char[] arr=input.toCharArray();
        System.out.println("Charcater array of given string is :"+ Arrays.toString(arr));
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i< arr.length;i++){
            Character current=arr[i];
            hm.put(current,hm.getOrDefault(current,0)+1);
        }
        for(char i:hm.keySet())
            System.out.println(i+" "+hm.get(i));

        int maxCount= Collections.max(hm.values());
        int minCount=Collections.min(hm.values());

        List<Character> maxChars=new ArrayList<>();
        List<Character> minChars=new ArrayList<>();

        for(Map.Entry<Character,Integer> entry:hm.entrySet()){
            if(entry.getValue()==maxCount)
                maxChars.add(entry.getKey());
            if(entry.getValue()==minCount)
                minChars.add(entry.getKey());

        }
        System.out.println("Maximum occurring characters: " + maxChars + " (count: " + maxCount + ")");
        System.out.println("Minimum occurring characters: " + minChars + " (count: " + minCount + ")");
    }




    }

