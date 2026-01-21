package com.ananya.Java8;

public class Lambdas {
    public static void main(String[] args) {
        Runnable run=new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable is running");
            }
        };
        new Thread(run).start();

        Runnable r2=()-> System.out.println("Runable 2 is running");
        new Thread(r2).start();

    }
}
