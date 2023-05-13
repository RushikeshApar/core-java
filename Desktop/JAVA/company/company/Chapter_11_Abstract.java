package com.company;
abstract class Parent2{     // abstract class is declare with key word abstract

    Parent2(){
        System.out.println("im a constructor of Parent2");
    }

    public void sayHellow(){
        System.out.println("Hallow rushi");
    }
                                            //abstract methods  is declare with key word abstract.
    abstract public void greet();           // abstract method has no implementation in abstract class.
    abstract public void greet2();         //abstract method has only declaration in abstract class.

    public void concreat(){
        System.out.println("im a non abstract method of a Parent2 class");// in abstract class concret method
    }                                                              //also can use(but minimum one method must be abstract)
}
class Child2 extends Parent2{

    @Override
    public void greet(){
        System.out.println("Good morning"); // abstract method implement in sub class by method overriding
    }

    @Override
    public void greet2(){
        System.out.println("Good night");
    }
}
abstract class child3 extends Parent2{
    public void rush(){
        System.out.println("im a good");
    }
}
public class Chapter_11_Abstract {
    public static void main (String args[]){
//         Parent2 p = new Parent2() ; // error --> we can not creat  a object of abstract class

        Child2 ch = new Child2();  // this is  correct (concrete class)
        ch.greet();

 //       child3 chh = new child3() ; // error --> child3 is a abstract class so we cant create a object of child3.

          Parent2 cf = new Child2();  // dynamic method dispatch (run time polymorphism)
          cf.greet();

         }
    }

