package com.ananya.strings;
//WAP to find first repeated and first nonrepeated chracter in String
public class FirstRepeatedAndNonRepeatedCharacter {
    public static void main(String[] args) {
        String s="java is easy";
        //char[] arr=s.toCharArray();
        char firstrepeated=' ';
        char firstNonrepeated=' ';
        int count=0;
        for(int i=0;i<s.length();i++){
            char temp=s.charAt(0);
            if(temp!=' '){
                if(s.indexOf(temp)==s.lastIndexOf(temp))
                    firstNonrepeated=temp;
                else if (firstrepeated==' ') {
                    firstrepeated=temp;
                    
                }

            }

        }
    }
}
