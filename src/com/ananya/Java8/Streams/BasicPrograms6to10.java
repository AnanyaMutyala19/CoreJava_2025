package com.ananya.Java8.Streams;

import java.util.*;
import java.util.stream.Collectors;

public class BasicPrograms6to10 {
    public static void main(String[] args) {
        //Convert all strings in a list to uppercase using streams.
        List<String> str= Arrays.asList("Ananya","Subbarao","Harshitha","Venky","Raju");
        List<String> strsToUppercase=str.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
        System.out.println("Strings transformed to uppercase is: "+strsToUppercase);
        //Sort a list of integers using streams.
        List<Integer> numbers=List.of(1,90,4,8,29,10,55);
        List<Integer> sortedNum=numbers.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted Numbers from the list of integers is :"+sortedNum);
        //Sort a list of strings alphabetically using streams.
        List<String> str1= Arrays.asList("Ananya","Subbarao","Harshitha","Venky","Raju","Jwalith");
        List<String> sortedStringsAlphabetically=str1.stream().sorted().collect(Collectors.toList());
        System.out.println("list of strings alphabetically using streams: "+sortedStringsAlphabetically);
        //Collect stream results back into a map.
        Map<String, Integer> wordLengthMap = str1.stream()
                .collect(Collectors.toMap(
                        w -> w,          // key = word itself
                        String::length   // value = length of word
                ));
        System.out.println("Each word and its length in map are :"+wordLengthMap);
        //Count the number of elements in a stream.
       long countInList =str1.stream().count();
        System.out.println("Number of elements in list are:"+countInList);
        //Find the maximum element in a list using streams.
        numbers.stream().sorted(Comparator.reverseOrder()).limit(1).forEach(System.out::println);
        //Find the minimum element in a list using streams.
       Optional<Integer> minValue= numbers.stream().reduce((a, b)->a<b?a:b);
        System.out.print("Minimum value from list of integers is: ");
        if(minValue.isPresent())
            System.out.println(minValue.get());
        //Reduce a list of integers to their sum using streams.
        int sum=numbers.stream().reduce(0,(x,y)->x+y);
        System.out.println("Sum of numbers is :"+sum);
        //Check if any element in a list is greater than 10 using streams.
        numbers.stream().filter(i->i>10).forEach(System.out::println);








    }
}
