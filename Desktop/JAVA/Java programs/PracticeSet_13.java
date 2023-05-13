package com.company;
import java.util.*;


 class PracticeA extends Thread{
     public void run(){
         while (true){
             System.out.println("Good Morning");
         }
     }
 }
class PracticeB extends Thread{
    public void run(){
        while (true){

            try {
                Thread.sleep(200);  // this method is used to delay for 200 milli second this welcome will delay
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Welcome");
        }
    }
}

public class PracticeSet_13 {
public static void main (String args[]){
             PracticeA A1 = new PracticeA();
             PracticeB B2 = new PracticeB();
                                                                   //in thread
             A1.setPriority(3);                                    //MIN_Priority=1
             B2.setPriority(9);                                   //NORM_Priority=5
                                                                  // MAX_Priority=10

             System.out.println(A1.getPriority());
             System.out.println(B2.getPriority());

             System.out.println(A1.getState());
             System.out.println(B2.getState());

             System.out.println(Thread.currentThread().getState()); // to show current thread reference

//             A1.start();
//             B2.start();


 }
}
