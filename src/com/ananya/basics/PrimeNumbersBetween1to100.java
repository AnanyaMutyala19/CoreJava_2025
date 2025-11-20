package com.ananya.basics;

public class PrimeNumbersBetween1to100 {
    public static void main(String[] args) {
        System.out.println("prime numbers between 1 to 100 are:" );
        for(int num=2;num<=100;num++)
        {
            boolean isPrime=true;
            for(int i=2;i<=num/2;i++){
                if(num%i==0)
                {
                    isPrime=false;
                    break;
                }

            }
            if(isPrime)
                System.out.println(num +" ");

        }
    }
}
