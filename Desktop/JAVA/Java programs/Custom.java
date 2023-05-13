package com.company;

class employee{
    int id;
    String  name;
    int sallary;

    public void printdetails(){
        System.out.println(" my id is " + id);
        System.out.println(" my name is  " + name);
        System.out.println(" my sallary is :  " + sallary);
    }
}
public class Custom {

    public static void main (String args[]){
        System.out.println("this is our custom class");

        //instantiating new employee object
        employee rushi = new employee();
        employee raju  = new employee();
        employee kartik = new employee();

        // setting attributes for rushi
        rushi.id = 51;
        rushi.name = "code with rushi";
        rushi.sallary = 6500000;

        // setting attributes for raju
        raju.id =54;
        raju.name=" code with  raju ";
        raju.sallary = 1200000;

        //setting attributes for kartik
        kartik.id = 56;
        kartik.name = "code with kartik";
        kartik.sallary = 300000;


        //System.out.println(rushi.id);
        //System.out.println(rushi.name);
        rushi.printdetails();
        raju.printdetails();
        kartik.printdetails();

    }
}
