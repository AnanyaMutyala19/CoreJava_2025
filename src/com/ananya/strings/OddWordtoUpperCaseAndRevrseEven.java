package com.ananya.strings;

public class OddWordtoUpperCaseAndRevrseEven {
    public static void main(String[] args) {
        String input="Java is super";
        String[] words= input.split(" ");
        String outputString=" ";
        for(int i=0;i< words.length;i++){
           String word=words[i];
           if(i%2==0){
              outputString+=word.toUpperCase();
           }
           else
               outputString+=getReverseOfString(word);
           outputString+=" ";
       }
        System.out.println("Final output of string is: "+outputString);

       }

    private static String getReverseOfString(String inputString) {
        String revString=" ";
        for(int i=inputString.length()-1;i>=0;i--){
            revString+=inputString.charAt(i);
        }
        return revString;

    }
}

