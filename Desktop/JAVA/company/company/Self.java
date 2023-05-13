package com.company;

public class Self {

//    public static void mul(int n){
//        for (int i = 1; i<=10;i++){
//            System.out.format("%d X %d = %d\n",n,i,n*i);
//        }
//    }
//    static void star(int n ){
//        for (int i = 0; i<n;i++){
//            for (int j = 0; j<i+1; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//    static int sumRec(int n){
//        if (n==1){
//            return 1;
//        }
//        else {
//            return n + sumRec(n-1);
//        }
//
//    }
    static void Star1(int n){
        for (int i=n; i>0; i--){
            for(int j=0; j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
//    static int fib(int n){
//        if (n==1){
//            return 0;
//        }
//        else if(n==2){
//            return 1;
//        }
//        else {
//            return fib(n-1)+fib(n-2);
//        }
//    }
//    static int fib(int n){
//        if (n==1||n==2){
//            return n-1;
//        }
//        else{
//            return fib(n-1)+fib(n-2);
//        }
//    }
//        public static float sum(float...rushi){
//             float result = 0;
//             for (float element:rushi){
//                 result = result+element;
//             }
//             return result/rushi.length;
//        }


    public static void main (String args[]){
//         mul(14);

//         star(4);

//         Star1(10);

//       int c = sumRec(4);
//        System.out.println(c);

//        int result = fib(7);
//        System.out.println(result);

//        System.out.print("the result is : ");
//        System.out.println(sum(84.4f,23.6f));


    }
}

