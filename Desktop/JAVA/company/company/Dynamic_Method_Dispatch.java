package com.company;

class Phone{
    public void showTime(){
        System.out.println("time is 5.00 Am");
    }
    public void on(){
        System.out.println("turnig on phone...");
    }
}

class SmartPhone extends Phone {
    public void music() {
        System.out.println("play the music in SmartPhone");
    }
       @Override
    public void on() {
        System.out.println("turnig on SmartPhone...");
    }
}
public class Dynamic_Method_Dispatch {
       public static void main (String args[]){

            Phone p = new Phone();
            p.showTime();                     // is allowed
            p.on();

            SmartPhone sp = new SmartPhone();
            sp.music();
            sp.on();

            Phone ph = new SmartPhone();  // super_class reference = new Sub_class(); --> Is allowed
            ph.on();

//          SmartPhone sp = new Phone(); // this is not allowed (sub_class reference = new super_class)

       }
}


