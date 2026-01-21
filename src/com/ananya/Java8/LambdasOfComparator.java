package com.ananya.Java8;

import org.w3c.dom.ls.LSOutput;

import java.util.Comparator;

public class LambdasOfComparator {
    public static void main(String[] args) {
        Comparator<Integer> comp=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println("result of comparator i s:"+ comp.compare(2,5));
        Comparator<Integer> complamda=(o1,o2)-> o1.compareTo(o2);
        System.out.println("Result using lambd comparator is :"+complamda.compare(10,1));
    }


}
