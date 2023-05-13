package com.company;
class Base{
   public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("im in base now and setting x ");
        this.x = x;
    }

    public void printMe(){
        System.out.println("hellow base ");
    }
}

class Derived extends Base {
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}



public class Inheritance {
    public static void main (String args[]){
        // creating an object of base class
        Base b = new Base();
        b.setX(4);                             // Derived class get base class member and also can add own changes.
        System.out.println(b.getX());                 // Base class can not access Derived Class member.

        // creating an object of Derived class
        Derived d  = new Derived();
        d.setX(44);
        System.out.println(d.getX());


    }
}
