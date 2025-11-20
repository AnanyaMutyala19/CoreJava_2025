package com.ananya.strings;

import java.util.Arrays;

public class StringsBasics {
    public static void main(String[] args) {
        //Strings are
        char[] ch={'a','b','c'};
        System.out.println(Arrays.toString(ch));
        String s1="Hello";
        s1.concat("world");
        System.out.println(s1);

    }
}
