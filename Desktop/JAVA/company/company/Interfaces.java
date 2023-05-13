package com.company;              // INTERFACES FORCE TO CLASS TO IMPLEMENTS INTERFACES METHODS.

 interface   Bicycle {                   // interfaces is a group of empty related method
        int a = 12;             // properties are final in interfaces they can not be change
    void applyBreak();
     void speedUp();

                              // we can create default methods and implement in interfaces
      default  void phone(){
         System.out.println("Im a default method of interface Bicycle");
     }

}

 interface Bike{
    void dukeHorn();          // interfaces methods are by  default public no need declare it explicitly.
    void apacheHorn();
}
                                             // In abstract class or in classes we can can extend only 1 class.
 class AvonCycle implements Bicycle,Bike{  // In interfaces we can implement multiple interfaces and extend one class also.

    public void blowHorn(){
        System.out.println("pee pee pee..");
    }
    @Override
    public void phone(){
        System.out.println("Im a override method of interface Bicycle");
    }

  public void applyBreak(){
      System.out.println("applying breaks");  // method must be declare in implement class with access modifier public
                                             }

    public void speedUp(){
        System.out.println("speeding up");
    }

   public void dukeHorn(){
        System.out.println("blowing horn of duke_125 bike");
    }
   public void apacheHorn(){
        System.out.println("blowing horn of apache_200 bike");
        }
        }

public class Interfaces  {
    public static void main (String args[]) {

        AvonCycle rushiCycle = new AvonCycle();
        rushiCycle.applyBreak();

        Bicycle b = new AvonCycle() ; // we can not create obj of interface,but we can use as reference.
        b.applyBreak();


        System.out.println(rushiCycle.a);// you can create properties in interfaces

//         rushiCycle.a = 22; // error ---> can't change
//        System.out.println(rushiCycle.a);// you can not modify the properties in interfaces as they are final

        rushiCycle.applyBreak();
        rushiCycle.speedUp();
        rushiCycle.phone();  // its called override method
        rushiCycle.blowHorn();
        rushiCycle.dukeHorn();
        rushiCycle.apacheHorn();

    }
}
