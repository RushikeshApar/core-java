package com.company;
public class Recursion{
    //    factorial(0)= 1
//    factorial(n)= n * n-1 * ...1
//    factorial(5)= 5 * 4 * 3 * 2 * 1
//    factorial(n) = n * factorial(n-1)   // mathematical formula
    static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }

    }
    static int factorial_iterative(int n){
        if (n==0 || n==1){
            return 1;
        }
        else {
            int product =1;
            for (int i = 1; i<=n;i++){ // 1 to n
                product = product * i;
            }
            return product;
        }
    }

    public static void main (String args[]){
//        int n = 5;  I can use this also print n in factorial.
        System.out.println(factorial(5));   //5*4*3*2*1
        System.out.println(factorial_iterative(5)); // 1*2*3*4*5
    }
}
