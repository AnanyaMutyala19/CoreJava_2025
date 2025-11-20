package com.ananya.StringsBySP;
//WAP to compare two Strings lexicographically
public class LexicographicalComparission {
    public static void main(String[] args) {
        String s1="banana";
        String s2="Apple";
        int result=s1.compareTo(s2);
        if(result==0)
            System.out.println("Both strings are equal");
        else if (result<0) {
            System.out.println(s1+"come before "+s2);
        }
        else
            System.out.println(s1+"comes after"+s2);

    }
}
