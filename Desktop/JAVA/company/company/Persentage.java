package com.company;

import java.util.Scanner;

public class Persentage {
    public  static  void main (String args[]){
        System.out.println("Welcome to CBSE percentage maker");
        System.out.println("    ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Physics marks");
        int Physics = sc.nextInt();
        System.out.println("Enter your Chemistry marks");
        int Chemistry = sc.nextInt();
        System.out.println("Enter your Mathematics marks");
        int Mathematic = sc.nextInt();
        System.out.println("Enter your computer marks");
        int computer = sc.nextInt();
        System.out.println("Enter your English marks");
        int English = sc.nextInt();
        float Percentage = ((Physics + Chemistry + Mathematic + computer + English)/500.0f)*100;
        System.out.print("your final percentage is :");
        System.out.println(Percentage);


    }

}
