package com.ananya.strings;

import java.util.Scanner;

public class GetCharacterFromGIvenString {
    public static void main(String[] args) {
        System.out.println("Enter name of person");
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        System.out.println("Enter target character");
        char ch=sc.next().charAt(0);
        for(int i=0;i<input.length();i++){
            if(ch==input.charAt(i)){
                System.out.println("Character found at index "+i);
                break;
            }
            else
                System.out.println("Character is not found");
        }


    }
}
