package com.ananya.StringsBySP;

//WAP to add characters to a String
public class AddCharactersToString {
    public static void main(String[] args) {
        String s="Ananya";
      String appended=s+"!";
      String prepended="@"+s;
      String inserted=s.substring(0,2)+"_"+s.substring(2);
        System.out.println("String appended :"+appended);
        System.out.println("String Prepended :"+prepended);
        System.out.println("String inserted :"+inserted);
    }
}
