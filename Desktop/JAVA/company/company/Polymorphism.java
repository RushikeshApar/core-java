package com.company;

interface A1{
   void a0();
   void a1();
}

interface B1{
   void b0 ();
   void b1 ();
}
class Ab{
   void ab0(){
       System.out.println("ab");
   }
}
class Abc extends Ab implements A1,B1{
   public void a0(){

    }
   public void a1(){

    }
   public void b0 (){

   }
   public void b1 (){

   }
}

public class Polymorphism {
    public static void main (String args[ ]){


    }
}
