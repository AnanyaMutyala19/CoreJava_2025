package com.ananya.StringsBySP;

import java.util.Arrays;

//WAP to print even length words in a given String
public class EvenLengthWordsInString {
    public static void main(String[] args) {
        String input="I need to change company at any cost";
        String[] arr=input.split(" ");
        System.out.println("The string of input words:"+ Arrays.toString(arr));
        String output="";
        for(int i=0;i< arr.length;i++){
            if(i%2==0){
                output+=arr[i]+" ";

            }

        }
        System.out.println("Required string is:"+output);

    }
}
