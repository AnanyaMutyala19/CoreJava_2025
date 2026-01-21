package com.ananya.Java8.SreamsPractiseFromLinkedIn;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FilterEvenNUms {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> evenNums=nums.stream().filter(s->s%2==0).collect(Collectors.toList());
        System.out.println("Even Numbers from list of integers is:"+evenNums);

        Optional<Integer> maxElement=nums.stream().reduce((x, y)->x>y?x:y);
        System.out.println("Maximum element is :"+maxElement.get());

        OptionalInt max = IntStream.rangeClosed(10, 20).max();
        System.out.println("Max element in 10-20 is :"+max.getAsInt());

        //Sort a list in reverse order
       List<Integer> reverseList= nums.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Reverse order list is:"+reverseList);

        //Count strings with specific prefix
        List<String> words = Arrays.asList("prefix", "prelude", "presentation", "apple", "preview", "banana");
        String prefix="pre";
        long countofwordsWithPrefix=words.stream().filter(s->s.startsWith(prefix)).count();
        System.out.println("Number of words with specific prefix is :"+countofwordsWithPrefix);

        //Frst nonrepeated charcter in string
        String text = "anana";
        Optional<Character> nonrepeated=text.chars().mapToObj(c->(char)c).filter(ch -> text.indexOf(ch) == text.lastIndexOf(ch)).findFirst();
        System.out.println(nonrepeated.orElse(null));

        //list of strings to uppercase
        List<String> upperCase=words.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("Strings in uppercase:"+upperCase);

        //Sum of numbers
        Integer reduce = nums.stream().reduce(0, (x, y) -> x + y);
        System.out.println("Sum of numbers is:"+reduce);

        //Check if any string matches a condition

       boolean b= words.stream().anyMatch(bu->bu.startsWith("b"));
        System.out.println("Strings start with b:"+b);

        //FInd duplicates in list
        List<Integer> nums1=Arrays.asList(1,1,2,3,4,5,4,5,6);
        List<String> fruits=Arrays.asList("apple", "banana", "apple");
        Collections.frequency(fruits,"apple");
        Collections.frequency(fruits,"orange");
        nums1.stream().filter(i->Collections.frequency(nums1,i)>1).distinct().forEach(System.out::println);

        //Group strings by length
      Map<Integer,List<String>> stringsByLength=words.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(stringsByLength);

        //Flatten a nested list
        List<List<Integer>> list=Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(5,6,7),Arrays.asList(10,11,12));
        List<Integer> collectFlatList = list.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println("Flattened list of integers is :"+collectFlatList);
        //Concatinate all strings n a list
        String collect = words.stream().collect(Collectors.joining(" "));
        System.out.println("String after concatination is :"+collect);
        //Find longest string in list
       Optional<String> maxLength=words.stream().max(Comparator.comparingInt(String::length));
        System.out.println("MAximum length string is :"+maxLength.orElse(null));
        //Find average of nums
      double average= nums.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println("Average of ntegers is:"+average);
        //convert a list into map
        Map<String,Integer> listToMap=words.stream().collect(Collectors.toMap(w->w,String::length));
        System.out.println("Map from list of integers is :"+listToMap);
        //3rd largest element in list
        Optional<Integer> thirdLargest=nums.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst();
        System.out.println("third largest element is:"+thirdLargest.get());
        //Detect palindromes in list
        List<String> words1 = Arrays.asList("madam", "apple", "racecar", "Level");
        List<String> palindromes=words1.stream().filter(w->w.equalsIgnoreCase(new StringBuilder(w).reverse().toString())).collect(Collectors.toList());
        System.out.println("plaindromes in the list are:+" +palindromes);
        //reverse each word in string list
        List<String> reversedList=words1.stream().map(s->new StringBuffer(s).reverse().toString()).collect(Collectors.toList());
        System.out.println("Reversed list in strings are :"+reversedList);
        //Filter a map with values greater than 10
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 5);
        map.put("B", 15);
        map.put("C", 8);
        map.put("D", 20);
       Set<Map.Entry<String, Integer>> enties=map.entrySet();
        Map<String, Integer> filtered = map.entrySet().stream()
                .filter(entry -> entry.getValue() > 10)   // keep only values > 10
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue
                ));

        System.out.println(filtered);




    }
}
