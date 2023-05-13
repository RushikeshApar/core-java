package com.company;

public class ThrowAndThrows {
    public static int devide(int a, int b)throws ArithmeticException{       // tails another coder this function can
        int result = a/b;                                                   //throw ArithmeticException
        return result;
    }
    public static void main (String args[]){
        try{
            int c = devide(12 ,0);
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("this is end of program");
    }

}
