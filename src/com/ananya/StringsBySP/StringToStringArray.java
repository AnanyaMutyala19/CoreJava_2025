package com.ananya.StringsBySP;

import java.util.Arrays;

//11
//WAP to convert String to String Array
public class StringToStringArray {
    public static void main(String[] args) {
        String s="Ananya is a good and obidient girl";
        String[] arr=s.split(" ");
        System.out.println(Arrays.toString(arr));

    }
}
