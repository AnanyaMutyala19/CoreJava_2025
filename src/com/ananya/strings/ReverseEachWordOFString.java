package com.ananya.strings;

import java.util.Scanner;

public class ReverseEachWordOFString {
    public static void main(String[] args) {
        System.out.println("Enter input for this program");
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
       String[] arr= input.split(" ");
        String rev=" ";
       for(String i:arr){
           for(int j=i.length()-1;j>=0;j--){
               rev+=i.charAt(j);
           }
           rev+=" ";
       }
        System.out.println("Reverse string in each words :"+rev);
    }
}
