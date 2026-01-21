package com.ananya.Java8.StreamsScenarios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsBeginnerQuestions {
    public static void main(String[] args) {

        // 1. Filtering Even Numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers=numbers.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println("Even numbers in list is :"+evenNumbers);
        // 2. Convert List of Strings to Uppercase
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        List<String> upperCaseStrings=words.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("Strings to uppercase : "+upperCaseStrings);
        // 3. Find the First Element that Starts with 'S'
        List<String> names = Arrays.asList("John", "Smith", "Sara", "Michael");
        Optional<String> firstElementWithS=names.stream().filter(s->s.startsWith("S")).findFirst();
        if(firstElementWithS.isPresent()){
            System.out.println("Elements that start with 'S' are:"+firstElementWithS.get());
        }
        //4. Sum of All Elements
        int sum=numbers.stream().reduce(0,(x,y)->x+y);
        System.out.println("Sum of elements is:"+sum);
        //   5. Count Words with Length > 3
        long countOFWordsGreaterThan3=names.stream().filter(s->s.length()>3).count();
        System.out.println("count of words"+countOFWordsGreaterThan3);
        // 6. Sorting Numbers in Descending Order
        List<Integer> numbersInDecreasing=numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Numbers in decreasing order is:"+numbersInDecreasing);
        // 7. Remove Duplicates from a List
        List<Integer> duplicateNumbers = Arrays.asList(1, 2, 3, 2, 4, 3, 5, 1);
        List<Integer> duplicateNumber= duplicateNumbers.stream().distinct().collect(Collectors.toList());
        System.out.println("After removing duplicates the list is :"+duplicateNumber);
        // 8. Convert List of Strings to a Single Comma-Separated String
        String joinedWords=words.stream().collect(Collectors.joining(","));
        System.out.println("Words after joining with comma are:"+joinedWords);
        // 9. Find the Maximum Value
        Optional<Integer> maxNumber=numbers.stream().sorted(Comparator.reverseOrder()).findFirst();
        System.out.println("Maximum number is:"+maxNumber.get());
        // 10. Check if Any String Starts with 'A'
        List<String> nameList = Arrays.asList("Bob", "Alice", "Charlie", "Andrew");
        boolean startsWithA=nameList.stream().anyMatch(s->s.startsWith("A"));
        System.out.println("Transactions count is: "+startsWithA);







    }
}
