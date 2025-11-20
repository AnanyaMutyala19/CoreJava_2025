package com.ananya.StringsBySP;
//WAP to count the number of words in a String
public class NumberOfWordsInString {
    public static void main(String[] args) {
        String input="Java is amazing in all way";
        String[] arr=input.split(" ");
        System.out.println("The number of words in string are :"+arr.length);

    }
}
