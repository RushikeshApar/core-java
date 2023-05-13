package com.company;
public class Acsses_Mself {

    public static int mul(int a, int b){
       int z = a + b ;
     return z;
    }
    public  static void main (String args[]){    // without using static method like - public int mul(int a, int b)
        Acsses_Mself aa = new Acsses_Mself();     // here we need to create obj of of a class
        int c =  aa.mul(32,23);
        System.out.println(c);

        int a =32;
        int b =23;                  // here we need to create static method like -  public static int mul(int a, int b)
        int c1 = mul(32,23);
        System.out.println(c1);     // here we NO need to create obj of of a class
    }
}
