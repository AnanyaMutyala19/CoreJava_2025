package com.ananya.Java8.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BasicsOfStreams {
    public static void main(String[] args) {
        //Create a stream from a list of integers and print each element.
        List<Integer> li= Arrays.asList(1,4,2,40,89);
        li.stream().forEach(System.out::println);
        //Create a stream from an array of strings and print each element.
        String[] str={"Hello","Ananya","is","good","girl"};
        List<String> str1=Arrays.asList(str);
        str1.stream().forEach(System.out::println);
        //Filter even numbers from a list using streams.
        List<Integer> li1=Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> evenNumbersList=li1.stream().filter(i->i%2==0).collect(Collectors.toList());
        for(Integer i:evenNumbersList)
            System.out.println(i);
        //Filter strings that start with "A" from a list.
        List<String> stringsOfNames=List.of("Ananya","Asritha","anil","subbarao","harshi");
        stringsOfNames.stream().filter(s->s.startsWith("A")).forEach(System.out::println);
        //Map a list of strings to their lengths using streams.
        stringsOfNames.stream().map(s->s.length()).forEach(System.out::println);



    }
}
