package com.ananya.threads;
class MyThread extends Thread{

    @Override
    public void run(){
        int count=1;
        while(true){
            System.out.println(count++ +"My thread");

        }
    }
}
public class ThreadTest1 {
    public static void main(String[] args) throws InterruptedException {
        MyThread t=new MyThread();
        t.setDaemon(true);
        t.start();
        int count=1;
        while(true){
            System.out.println(count++ +"Main");
            Thread.yield();

        }


    }
}
