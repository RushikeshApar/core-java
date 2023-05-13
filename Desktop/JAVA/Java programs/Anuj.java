package com.company;

public class Anuj {
    static int sum(int n){
      if (n==1){       // base case
          return 1;
      }
      else {
          return n +sum(n-1);   //math connection
      }
    }
    public static void main (String args[]){
        System.out.println(sum(5));

    }
}
