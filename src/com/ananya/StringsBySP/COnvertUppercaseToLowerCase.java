package com.ananya.StringsBySP;

public class COnvertUppercaseToLowerCase {
    public static void main(String[] args) {
        String s="cbzTgwyDWKJENuuu";
        StringBuilder sb=new StringBuilder(s.length());

        for(char c:s.toCharArray()){
            if(Character.isUpperCase(c)){
                sb.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            }
            else
                sb.append(c);
        }
        System.out.println("Toggled string is:"+sb.toString());
    }
}
