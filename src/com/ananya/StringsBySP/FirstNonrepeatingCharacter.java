package com.ananya.StringsBySP;

import java.util.HashMap;

//WAP to find the first non-repeating character in a given String
public class FirstNonrepeatingCharacter {
    public static void main(String[] args) {
        String s="Ananya";
        char[] arr=s.toCharArray();
        HashMap<Character,Integer> hm=new HashMap<>();

        for(int i=0;i< arr.length;i++){
            char current=arr[i];
            hm.put(current,hm.getOrDefault(current,0)+1);
        }
        for(char i:hm.keySet()){
            System.out.println(i+" "+hm.get(i));
            if(hm.get(i)==1){
                System.out.println("First non repeating charcater is:"+i);
                break;
            }
        }

    }
}
