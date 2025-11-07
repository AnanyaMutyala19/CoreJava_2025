package com.ananya.basics;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of user");
        String name=sc.nextLine();
        System.out.println("Enter age of that person");
        int age=sc.nextInt();
        System.out.println("Enter your favourite number");
        double num=sc.nextDouble();
        System.out.println("Details of that user are:");
        System.out.println("the person name is"+name+"with age of"+age+"and his favourite number"+num);

        //System.out.println("The entered string is:"+name);
        sc.close();
    }
}
