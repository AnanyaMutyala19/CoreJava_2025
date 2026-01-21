package com.ananya.CollectionList;

import java.util.ArrayList;
import java.util.Arrays;

public class ProgramToMergeTwoListsIntoSingle {
    public static void main(String[] args) {
        ArrayList<Integer> al1=new ArrayList<>(Arrays.asList(4,9,8));
        ArrayList<Integer> al2= new ArrayList<>(Arrays.asList(5,0,10));
        ArrayList<Integer> al3=new ArrayList<>();
        for(Integer i:al1)
            al3.add(i);
        for(Integer j:al2)
            al3.add(j);
        System.out.println(al3);



    }
}
