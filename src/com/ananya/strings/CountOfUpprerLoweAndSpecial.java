package com.ananya.strings;

public class CountOfUpprerLoweAndSpecial {
    public static void main(String[] args) {
        String input="JavA5is&Su6p%eR";
        int upper=0;
        int lower=0;
        int digits=0;
        int specialChars=0;
        char[] arr=input.toCharArray();
        for(char i:arr){
            if(Character.isUpperCase(i))
                upper++;
            else if (Character.isLowerCase(i))
                lower++;
            else if(Character.isDigit(i))
                digits++;
            else
                specialChars++;
        }
        System.out.println("NUmber of uppercase characters in string is :"+upper);
        System.out.println("Number of lowercase characters in string is :"+lower);
        System.out.println("NUmber of digits  in string is :"+digits);
        System.out.println("Number of special characters in string is :"+specialChars);


    }
}
