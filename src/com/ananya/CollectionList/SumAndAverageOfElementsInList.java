package com.ananya.CollectionList;

import java.util.ArrayList;
import java.util.Scanner;

public class SumAndAverageOfElementsInList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of arraylist");
        int listSize=sc.nextInt();
        ArrayList<Integer> li=new ArrayList<>();
        System.out.println("Please enter the elements in list");
        int sum=0;
        for(int i=0;i<listSize;i++){
            li.add(sc.nextInt());

        }
        System.out.println(li);
        for(int i=0;i<listSize;i++){
            sum+=li.get(i);
        }
        System.out.println("The sum of numbers in list :"+sum);
        System.out.println("Average of numbers in list provided is :"+sum/listSize);
        sc.close();


    }
}
