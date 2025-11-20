package com.ananya.strings;

import java.util.Scanner;

public class CountOfCharacters {
    public static void main(String[] args) {
        System.out.println("Enter input string");
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        int count=0;
        for(int i=0;i<input.length();i++){
            input.charAt(i);
            count++;
        }
        System.out.println("Number of characters: "+count);
        //To count number of words in string
        String[] inputwords=input.split(" ");
        int countOfwORDS=inputwords.length;
        System.out.println("Number of words in String :"+countOfwORDS);
        sc.close();

    }
}
