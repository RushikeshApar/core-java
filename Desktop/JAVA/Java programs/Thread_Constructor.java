package com.company;


class Mythr extends Thread{
   public Mythr(String name){  // creating a constructor with String (parameter name)
                                       //we are making Mythr class by extending Thread class.
      super(name);      // calling parameterized constructor from extended Thread class,which contains String value(name)
    }

    public void run (){
       int i =0;
       while (i<10){
           System.out.println("im a thead");
           i++;
       }
    }
}
public class Thread_Constructor {
    public static void main (String args[]){

        Mythr t =  new Mythr("Rushikesh");
        t.start();

        System.out.println("the id of thread is " + t.getId());
        System.out.println("the name of thread is " + t.getName());
        System.out.println("the state of a thread is " + t.getState());

    }
}
