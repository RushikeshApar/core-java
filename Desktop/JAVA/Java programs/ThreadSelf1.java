package com.company;

class MyThr extends Thread{

    public MyThr(String name){   // here we created constructor of thread which we can give name to Thread
        super(name);
    }
    public void run(){
        System.out.println("thanks"+this.getName());
    }
}
public class ThreadSelf1 {
    public static void main (String args[]){
                MyThr t1 = new MyThr("RUSHI");
                MyThr t2 = new MyThr("ANNA");

                t1.start();
                t2.start();
        System.out.println("the name of a Thread is " +t1.getName());
        System.out.println("the ID of a Thread is " + t1.getId());

        System.out.println("the name of a Thread is " + t2.getName());
        System.out.println("the ID of a Thread is " + t2.getId());



    }
}
