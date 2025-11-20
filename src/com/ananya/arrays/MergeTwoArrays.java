package com.ananya.arrays;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        String[] s1={"milk","coffee"};
        String[] s2={"tea","water","coke"};
        int len1=s1.length;
        int len2=s2.length;
        int len3=len1+len2;
        String[] s3=new String[len3];
        for(int i=0;i<len1;i++){
            s3[i]=s1[i];
        }
        for(int j=0;j<len2;j++){
            s3[j+len1]=s2[j];
        }
        System.out.println("Output array is :"+ Arrays.toString(s3));
    }
}
