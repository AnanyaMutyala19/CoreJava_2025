package com.ananya.CollectionList;

import java.util.Arrays;
import java.util.List;

public class SumOfEvenNumbersInLIst {
    public static void main(String[] args) {
        List<Integer> al= Arrays.asList(1,2,3,4,5,6);
        int sum=0;
        for(Integer i:al){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println("Sum of even numbers in list is :"+sum);

    }
}
