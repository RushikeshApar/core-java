package com.company;
                                   // there are two ways to multithreading.
 class Dezi1 extends Thread{          //1)in this type we extend Thread class which already present in java.

     @Override                        //run method is already in java which we need to override for, Thread programs.
     public void run(){
         while (true){                //  we always need run method , without this we can not used thread.
             System.out.println("1");
         }
     }
 }
class Dezi2 extends Thread{
    @Override
    public void run(){
        while (true){
            System.out.println("2");
        }
    }
}
class Dezi3 implements Runnable{
    @Override                       //2)in this type we implements runnable interface.
     public void run(){
         while (true){
             System.out.println("3");
         }
     }
}
class Dezi4 implements Runnable{
      @Override                                     //2)in this type we implements runnable interface.
    public void run(){
        while (true){
            System.out.println("4");
        }
    }
}
public class ThreadSelf{
     public static void main(String args[]) {

         Dezi1 d1 = new Dezi1();
         Dezi2 d2 = new Dezi2();

         d1.start();                           // start method is atomically call run method.
         d2.start();


         Dezi3 d3 = new Dezi3();                   // here we create obj of a class and obj of Thread then
         Thread t3 = new Thread(d3);
                                                   //obj of a class pass as a argument to Thread.
         Dezi4 d4 = new Dezi4();
         Thread t4 = new Thread(d4);

          t3.start();                       // by thread obj only  we call run method
          t4.start();



     }
}