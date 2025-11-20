package com.ananya.basics;

public class WrapperClass {
    public static void main(String[] args) {
        int i=20;
        Integer i1=i;//Autoboxing
        Integer i2=Integer.valueOf(i);//boxing
        int i3=i2;//Autounboxing
        int i4=i2.intValue();//unboxing


    }
}
