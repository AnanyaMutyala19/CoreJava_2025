package com.ananya.Java8.FunctionInterface;

import java.util.function.Consumer;

public class ConsumerFunctionalInterface {
    public static void main(String[] args) {
        Consumer<String> con=(s)-> System.out.println(s.toUpperCase());
         con.accept("ananya");
    }
}
