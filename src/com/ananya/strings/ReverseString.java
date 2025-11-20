package com.ananya.strings;

public class ReverseString {
    public static void main(String[] args) {
        String s="Ananya";
        int len=s.length();
        String revString="";
        System.out.println("Length of string is :"+len);
        for(int i=len-1;i>=0;i--){
            revString+=s.charAt(i);
        }
        System.out.println("Reversed String is :"+revString);
    }
}
