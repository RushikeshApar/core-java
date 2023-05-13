package com.company;

import java.util.Scanner;

public class Persentage {
    public  static  void main (String args[]){
        System.out.println("Welcome to CBSE percentage maker");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Physics marks");
        int Physics = sc.nextInt();
        System.out.println("Enter your Chemistry marks");
        int Chemistry = sc.nextInt();
        System.out.println("Enter your Mathematics marks");
        int Machematic = sc.nextInt();
        System.out.println("Enter your computer marks");
        int computer = sc.nextInt();
        System.out.println("Enter your English marks");
        int English = sc.nextInt();
        float Persentage = ((Physics + Chemistry + Machematic + computer + English)/500.0f)*100;
        System.out.print("your final persentage is :");
        System.out.println(Persentage);


    }

}
