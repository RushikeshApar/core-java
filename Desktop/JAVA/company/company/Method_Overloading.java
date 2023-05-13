package com.company;

public class Method_Overloading {
    static int sum (int a, int b){    // int a , int b ...  are parameters
        return a + b;
    }
    static int sum (int a, int b,int c){
        return a + b + c;
    }
    static int sum (int a, int b,int c, int d){
        return a + b + c + d;
    }
    public static void main (String args[]){
        System.out.println(sum(12,8));    // argument are actual
        System.out.println(sum(3,8,6));
        System.out.println(sum(3,4,6,7));
    }
}
