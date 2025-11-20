package com.ananya.StringsBySP;
//WAP to reverse a given String
public class ReverseAString {
    public static void main(String[] args) {
        String s="madam";
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        System.out.println("Reverse of a string is:"+rev);
        if(rev.equals(s))
            System.out.println("String is palindrome");
        else
            System.out.println("String is not palindrome");
    }
}
