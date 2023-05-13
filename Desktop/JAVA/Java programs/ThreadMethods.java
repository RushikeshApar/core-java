package com.company;

class MyTh1 extends Thread{
    public void run(){
        while (true){
            System.out.println("thanks");
        }
    }
}
class MyTh2 extends Thread{
    public void run(){
        while (true){
            System.out.println("thanks");
        }
    }
}
public class ThreadMethods {
    public static void main(String args[]){

        MyTh1 t1 = new MyTh1();
        MyTh1 t2 = new MyTh1();
        t1.start();                 // t1.sleep like that whenever need method learn to it from os
        t2.start();


    }
}
