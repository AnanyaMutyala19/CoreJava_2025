package com.ananya.StringsBySP;

import java.util.Arrays;
import java.util.HashMap;

//14
//WAP to print all duplicate characters in a String
public class DuplicateCharactersInString {
    public static void main(String[] args) {
        String input="Ananya";
        char[] arr=input.toCharArray();
        System.out.println("Array of characters in string are:"+ Arrays.toString(arr));
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            char current=arr[i];
            hm.put(current,hm.getOrDefault(current,0)+1);
        }
        int count=0;
        for(char i:hm.keySet()){
            //System.out.println(i+" "+hm.get(i));
            if(hm.get(i)>=2)
                System.out.println(i);

        }



    }
}
