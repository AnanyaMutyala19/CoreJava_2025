package com.ananya.CollectionList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BasicsOfList {
    public static void main(String[] args) {
        //Create a list of integers and print all elements,
        // Add, remove, and update elements in a list.
        List<Integer> li=new ArrayList<>();
        li.add(2);
        li.add(21);
        System.out.println(li);
        li.remove(0);
        System.out.println(li);
        li.add(1,10);
        System.out.println(li);
        System.out.println(li.size());
        System.out.println(li.contains(19));
        //Reverse a list without using built-in methods.
        List<Integer> list1=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        List<Integer> revList=new ArrayList<>();
        for(int i=list1.size()-1;i>=0;i--){
            revList.add(i);
        }
        System.out.println(revList);
        //Sort a list of integers in ascending order. a
        Collections.sort(revList);
        System.out.println(revList);
       //Sort a list of strings alphabetically.
        List<String> li2=new ArrayList<>(Arrays.asList("Apple","Cat","bat","dog"));
        Collections.sort(li2);
        System.out.println(li2);



    }
}
