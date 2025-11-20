package com.ananya.StringsBySP;

import java.util.Scanner;

//WAP to insert one String into another String
public class InsertStringIntoString {
    public static void main(String[] args) {
        String input="Java is very efficient";
        String insertString="its amazing";
        Scanner sc=new Scanner(System.in);
        int index=sc.nextInt();
        String appended=input.substring(0,index)+insertString+input.substring(index);
        System.out.println("After string inserted to another string output is :"+appended);
    }
}
