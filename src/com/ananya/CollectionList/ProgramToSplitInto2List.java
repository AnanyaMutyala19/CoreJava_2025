package com.ananya.CollectionList;

import java.util.ArrayList;
import java.util.Arrays;

public class ProgramToSplitInto2List {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        int listsize1= al.size()/2;
        int listsize2=al.size()-listsize1;
        ArrayList<Integer> al1=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>();
        for(int i=0;i<listsize1;i++){
            al1.add(al.get(i));
        }
        for(int i=0;i<listsize2;i++){
            al2.add(al.get(listsize1+i));
        }
        System.out.println("After splitting into 2 lists are:"+al1+al2);
    }
}
