package com.company;

class MyThread10 extends Thread{
    public void run(){                     // run method is already present in Thread class we only overriding it.
        for (int i=0; i<=5; i++){                    // the process happening in for loop is called job of a thread
            System.out.println("im child thread");
        }
    }
}                                         // this is called thread defining (above over all process)
public class DurgaThread {
    public static void main (String args[]){

        MyThread10 t10 = new MyThread10();    // instantiation of a thread.
        t10.start();                       // starting of a thread.


        for (int i=0; i<=5; i++){              // the process happening in for loop is called job of a main thread
            System.out.println("im main thread");
        }

    }             // this process are perform simultaneously.
}
