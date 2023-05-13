package com.company;
class Dog{
    public void breed (){
        System.out.println("Beagle is toy dog breed");
    }
    public void colour(){
        System.out.println("Beagle colour is try and black mix");
    }
}
class Anna extends Dog{
    public void barking(){
        System.out.println("Beagles barking is adorable");
    }

}
public class SelfInheritance {
    public static void main (String args[]){
        Dog d = new Dog();
        d.breed();    // dog class contain only two methods
        d.colour();   // dog class can not be access Anna class method

        Anna a = new Anna();
        a.breed();
        a.colour();             // Anna class can access Dog class method
        a.barking();           // and can add some new update




    }
}
