package com.company;

class MyThread1 extends Thread{
    public void run(){
        while (true){
            System.out.println("im thread 1");
        }
    }
}
class MyThread2 extends Thread{
    public void run(){

        while (true){
            System.out.println("im thread 2");
        }
    }
}

public class Chapter_13_Thread {
    public static void main (String args[]){

             MyThread1 m1 = new MyThread1();
             MyThread2 m2 = new MyThread2();
             m1.start();
             m2.start();

    }
}
