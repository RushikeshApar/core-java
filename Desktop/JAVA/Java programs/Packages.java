package com.company;

import java.util.Scanner; //---> import java.util.Scanner using this we can only import scanner package.

import java.util.*;     //---> import java.util.* using this we can import all java packages.(String,Scanner,random...)

public class Packages {

    public static void main (String args[]){

                                                    // we can import package directly here using below form,
     Scanner sc =  new Scanner(System.in); //--> import java.util.Scanner sc =  new import java.util.Scanner(System.in);
     int a = sc.nextInt();

        System.out.println("scanner input is " + a);

    }
}
