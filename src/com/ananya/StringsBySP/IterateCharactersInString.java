package com.ananya.StringsBySP;
//WAP to iterate over characters in a String
public class IterateCharactersInString {
    public static void main(String[] args) {
        String s="Ananya";
        System.out.println("All the characters in given string are:");
        for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(i)+" ");
        }
    }
}
