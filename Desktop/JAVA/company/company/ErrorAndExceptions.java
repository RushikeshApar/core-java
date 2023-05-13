package com.company;

import java.util.Scanner;

public class ErrorAndExceptions {
    public static void main(String args[]) {
        // @ without try catch block
//               int a = 6000;
//               int b = 0;
//               int c = a / b;
//        System.out.println("the result is "+ c);

        // @ with try catch block
//               int a = 6000;
//               int b = 0;
//               try {
//                   int c = a / b;           // try this
//                   System.out.println("the result is "+ c);
//               }
//               catch (Exception e){        // if exception occurs then handle it and print it
//                   System.out.println("we are failed to process reason : " + e);
//               }
//        System.out.println("end of the program");


        // @ special exception handling

        int[] marks = new int[3];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the array index ");
        int ind = sc.nextInt();

        System.out.println("Enter the number want to divide with");
        int number = sc.nextInt();

        try {
            System.out.println("the array index number you enter is " + marks[ind]);
            System.out.println("the result is after array-value/number is : " + marks[ind]/number);
        }
        catch (ArithmeticException e){      // specially handel ArithmeticException when occurred.
            System.out.println("ArithmeticException occurred!");
            System.out.println(e);   // reason
    }
        catch (ArrayIndexOutOfBoundsException e) {     // specially handel when ArrayIndexOutOfBoundsException occurred.
            System.out.println("ArrayIndexOutOfBoundsException!");
            System.out.println(e); // reason
        }

             catch (Exception e){     // another exception handel
                System.out.println("another exception !");
                System.out.println(e); // reason
        }
        }
    }

