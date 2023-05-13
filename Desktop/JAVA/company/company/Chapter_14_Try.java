package com.company;
import java.util.*;



public class Chapter_14_Try {
    public static void main (String args[]){

       int a = 10000;
       int b = 0;

       System.out.println("enter value of b");
       Scanner sc = new Scanner(System.in);
        b = sc.nextInt();

        try {
            int c = a/b;
            System.out.println(" this is result " + c);
        }
        catch (Exception e){
            System.out.println("sorry can't process reason:" + e );
        }

        System.out.println("program end");

    }
}
