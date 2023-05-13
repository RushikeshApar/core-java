package com.company;
import java.util.Scanner;


public class ElseIf {
    public static void main (String args[]){

        char var ='c';
        switch (var){
                case 'r':
                System.out.println("your going to adult");
                break;
                case 'c':
                System.out.println("your going to join a job");
                break;
                case 's':
                System.out.println("your going to retired");
                break;
                default:
                    System.out.println("enjoy tour life");
        }


        /*
        // is called if-else-if ladder
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your ege");
        int age = sc.nextInt();
        if (age>56){
            System.out.println("your experienced");
        }
        else if (age>46){
            System.out.println("your semi-experienced");
        }
        else if(age>36){
            System.out.println("your semi-semi-experienced");
        }
        else{
            System.out.println("your not experienced");
        }*/

    }
}
