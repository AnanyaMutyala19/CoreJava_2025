package com.ananya.StringsBySP;

import java.util.Arrays;

//WAP to check whether two Strings are Anagram
public class Anangrams {
    public static void main(String[] args) {
        String s1="liste";
        String s2="silent";

        s1=s1.replaceFirst("\\s","").toLowerCase();
        s2=s2.replaceFirst("\\s","").toLowerCase();

        if(s1.length()!=s2.length()){
            System.out.println("Strings are not anangrams anymore");
            return;
        }
        char[] arr1=s1.toCharArray();
        char[] arr2=s2.toCharArray();

        if(Arrays.equals(arr1,arr2))
            System.out.println("Strings are anagrams");
        else
            System.out.println("Strings are not anagrams");
    }
}
