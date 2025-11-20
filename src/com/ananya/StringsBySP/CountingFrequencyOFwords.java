package com.ananya.StringsBySP;

import java.util.HashMap;

public class CountingFrequencyOFwords {
    public static void main(String[] args) {
        String[] arr={"Hello","ananya","Hello","hi","good","day","ananya"};
        HashMap<String,Integer> macha=new HashMap<>();
        for(int i=0;i< arr.length;i++){
            String current=arr[i];
            /*if(macha.containsKey(current)){
                int prev=macha.get(current);
                macha.put(current,prev+1);
            }
            else
                macha.put(current,1);*/
            macha.put(current, macha.getOrDefault(current,0)+1);
        }

        for(String val:macha.keySet())
            System.out.println(val+ " " +macha.get(val));
    }
}
