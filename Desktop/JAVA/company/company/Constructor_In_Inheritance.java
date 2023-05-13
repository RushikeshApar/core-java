package com.company;
class Base1{

    Base1(){
        System.out.println("im a constructor of Base1 ");
    }
    Base1(int x){
        System.out.println("im a overloaded constructor of Base1 with value x : " + x);
    }

}
class Derived1 extends Base1{
    Derived1(){
//        super(0);
        System.out.println("im a constructor of Derived class");
    }
    Derived1(int x,int y){
        super(x);
        System.out.println("im a overloaded constructor of Derived1 with value y : " + y);
    }
}
class ChiledOfDerived extends Derived1{

    ChiledOfDerived(){
        System.out.println("im a constructor of class ChiledOfDerived");
    }
    ChiledOfDerived (int x,int y,int z){
        super(x, y);
        System.out.println("im a overloaded constructor of ChiledOfDerived with value z : " + z);
    }

}
public class Constructor_In_Inheritance {
    public static void main (String args[]){

//              Base1 b = new Base1();
//              Derived1 d = new Derived1(13,23);
               ChiledOfDerived  cd = new ChiledOfDerived(11,22,33);



    }
}
