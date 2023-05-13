package com.company;
class Mythre1 extends Thread {


    public Mythre1(String name) {  // creating a constructor with String (parameter name)
                                     //we are making Mythr1 class by extending Thread class.
        super(name);              // calling parameterized constructor from extended Thread class,which contains String value(name)
    }
    public void run(){
        System.out.println("thanks"+this.getName());
    }
}
public class Thread_Priority {
    public static void main (String args[]){
        Mythre1 t1 =  new Mythre1("Rushikesh1");
        Mythre1 t2 =  new Mythre1("Rushikesh2");
        Mythre1 t3 =  new Mythre1("Rushikesh3");
        Mythre1 t4 =  new Mythre1("Rushikesh4");
        Mythre1 t5 =  new Mythre1("Rushikesh5 "+ " most imp");

        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
