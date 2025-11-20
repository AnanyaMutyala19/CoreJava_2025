package com.ananya.StringsBySP;

import java.awt.*;
import java.util.Scanner;

public class GetCharacterFromString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter input string");
        String name=sc.nextLine();
        System.out.println("Enter Character to identify from string");
        char ch=sc.nextLine().charAt(0);
        for(int i=0;i<name.length();i++){
            if(ch==name.charAt(i))
                System.out.println("Character is found at index "+i+" in input string "+name);
        }
    }
}
