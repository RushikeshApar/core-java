package com.company;

public class PracticeSet_7 {
//               question no 1
//    static void multiplication (int n){
//        for (int i = 1;i<=10;i++) {
//            System.out.format("%d X %d = %d\n", n, i, n * i);
//        }
//    }

//              question 2
    static void pattern_iteration(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
//                 question 5
    static void pattern_recursion(int n){
        if (n>0){
            pattern_recursion(n-1);
            for (int i = 0; i<n;i++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

//                 question 3
//    static int fib(int n){
//        if (n==1){
//            return 0;
//        }
//        else if (n==2){               // for this if() and if else()
//                                    // we can use short cut if(n==1 || n==2){
//            return 1;               //return n-1;
//        }
//        else {
//            return fib(n-1)+fib(n-2);
//        }
//               question 4
//static float average(float...arr){
//     available as int []arr
//    float result = 0;
//    for (float element:arr){
//        result = result + element/arr.length;
//    }
//    return result;
//
//    }
//               question 5 - printing * pattern using recursion from Question 2


    public static void main (String args[]){
//       question 1- multiplication(3);

//      question 2-
        pattern_iteration(4);

//        question - 5
          pattern_recursion(4);
//       question -3             1,2,3,4,5,6,7.........index
//          fibonacci series --> 0,1,1,2,3,5,8,13,21,34,55  sum of past two number like 0+1=1
//         in this case Start from 1 |  if mention in question from index then it's start from 0
//        int result = fib(11);
//        System.out.println(result);

//           question -4
//        System.out.println(average(89.3f,78.04f,99.9f,88.32f,86.6f,56.5f));

    }
}
