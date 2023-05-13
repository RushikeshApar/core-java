package com.company;

public class Varargs {
    public static int  sum (int...arr){
       int result = 0;
       for (int element:arr){
           result = result + element;
       }
       return result;
    }
    public static void main (String args[]){
        System.out.println(sum(1,2));
        System.out.println(sum(2,3,1,4,6,7,8,9 ,100));
    }
}
