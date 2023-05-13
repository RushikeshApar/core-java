package com.company;

interface parent_math{
    void m1();
    void m2();
}

interface child_Math extends  parent_math{  // interfaces can extend another interface.
    void m3();
    void m4();
}

class Math implements child_Math {
    public void m1(){
        System.out.println("im a method m1");
    }
    public void m2(){
        System.out.println("im a method m2");
    }
    public void m3(){
        System.out.println("im a method m3");
    }
    public void m4(){
        System.out.println("im a method m4");
    }

}

public class Inheritance_In_nterfaces {
    public static void main (String args[]){

        Math m = new Math();

        m.m1();
        m.m2();
        m.m3();
        m.m4();

    }
}
