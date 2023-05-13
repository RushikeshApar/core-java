package com.company;
class Thread12  extends Thread{
    public void run(){

       while (true){
           System.out.println("im arushikesh apar");

       }
    }
}
class Thread100  extends Thread{
    public void run(){

        while (true){
            System.out.println("im arushikesh");

        }
    }
}
public class Thread13 {
    public static void  main (String args[]){
          Thread12 n12 = new Thread12();
          n12.start();
        System.out.println(n12.getState());
        Thread100 t100 = new Thread100();
        t100.start();

    }
}
