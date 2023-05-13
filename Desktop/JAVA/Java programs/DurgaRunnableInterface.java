package com.company;

class MyRunnable1 implements Runnable{
    public void run() {
       for (int i=0; i<=5; i++){
            System.out.println("im thread 1");
        }
    }

}

class MyRunnable2 implements Runnable{
    public void run() {
        for (int i=0; i<=5; i++ ){
            System.out.println("im thread 2");
        }
    }

}

public class DurgaRunnableInterface {
    public static void main (String args[]){

        MyRunnable1 bullet1 = new MyRunnable1();
        Thread Gun1 = new Thread(bullet1);

                                  // creating class obj then creating thread obj and passing it argument obj of class
        MyRunnable2 bullet2 = new MyRunnable2();
        Thread Gun2 = new Thread(bullet2);

        Gun1.start();
        Gun2.start();
    }
}
