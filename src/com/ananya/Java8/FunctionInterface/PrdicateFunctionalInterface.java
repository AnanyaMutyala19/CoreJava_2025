package com.ananya.Java8.FunctionInterface;

import java.util.function.Predicate;

public class PrdicateFunctionalInterface {
    public static void main(String[] args) {
        Predicate<Integer> p=(i)->(i%2==0);
        System.out.println(p.test(4));
    }
}
