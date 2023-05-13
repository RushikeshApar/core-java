package com.company;

import com.sun.xml.internal.ws.api.message.SuppressAutomaticWSARequestHeadersFeature;

import java.util.Scanner;

public class PracticeSet_6 {
    public static void main(String args[]) {
//            question 1  --->      creating and adding float array element
        int  [] marks = {4, 6, 6, 9, 10};
        int sum = 0;
        for (int element:marks){
             sum = sum + element;
         }
        System.out.println(" the sum of arrays element is : " + sum);

//        question 2  ---> checking given integer is present or not in given array
//        float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
//        float num  = 99.2f;
//        boolean isInArray =false;
//        for (float element:marks){
//            if (num==element){
//                isInArray = true;
//                break;
//            }
//        }
//        if (isInArray){
//            System.out.println("the element is present in array");
//        }
//            else{
//            System.out.println("the element is not present in array");
//        }


//          question 3 ----> find the average of marks
//        float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
//        float sum = 0;
//        for (float element : marks ){
//            sum = sum + element;
//        }
//        System.out.println("the value of average marks is : " + sum/marks.length);


////        question 4----> find the addition  of 2 matrix size is 2X3
//       int [][] mat1 ={{1,2,3},
//                       {4,5,6}};
//
//        int [][] mat2 ={{2,6,13},
//                        {3,7,1}};
//
//        int [][] result ={{0,0,0},
//                          {0,0,0}};
//        for (int i = 0; i<mat1.length;i++){// row number of time
//            for (int j = 0; j<mat1[i].length;j++){ // column number of time
//                System.out.printf("setting values fot i=%d and j=%d\n",i,j);
//                result[i][j] = mat1[i][j]+mat2[i][j];   // mathematical formula for matrix
//
//            }
//        }
//
//        for (int i = 0; i<mat1.length;i++){// row number of time
//            for (int j = 0; j<mat1[i].length;j++){ // column number of time
//                System.out.print(result[i][j] + " ");
//                result[i][j] = mat1[i][j] + mat2[i][j];   // mathematical formula for matrix
//
//            }
//            System.out.println("");
//        }


////        question  5 --->  reversing array using Swaping
//        int arr[]={1,2,3,4,5,6,7,8,9,10};
//
//        int l = arr.length;
//        int n = Math.floorDiv(l, 2);//   kuth parayant Swaping karaychi l/2  using formula
//        int temp; //for swaping two number using 3 block |a| |b| |temp|
//
//        for (int i =0;i<n;i++){
//            //Swap arr[i] and arr[l-1-i]
//           temp = arr[i];                    // c = a
//           arr[i] = arr[l-1-i];              // a = b
//           arr[l-1-i] = temp;                // b = c
//        }
//        for (int element: arr){
//            System.out.print(element +" ");
//        }
//              question 6 -----> finding the max element in array
//        int arr[]={1,2,3,4,5,689,7,8,9,10};
//        int max = 0;
//        for (int element:arr){
//            if (element>max){
//                max = element;
//            }
//        }
//        System.out.println("the max element is : " + max);
//


                // question 7 -----> find array is sorted or not
//        boolean isSorted =true;
//        int [] arr = {1, 2, 37, 4, 5, 6, 77};
//        for (int i = 0;i<arr.length-1;i++){
//            if (arr[i] > arr[i+1]){
//                isSorted = false;
//                break;
//            }
//        }
//        if (isSorted){
//            System.out.println("array is sorted");
//        }
//        else {
//            System.out.println("Array is not sorted");
//        }

    }
}



