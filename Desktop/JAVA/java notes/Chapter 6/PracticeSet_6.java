package com.company;

public class PracticeSet_6 {
public static void main (String args[]) {
    int arr1[] = {1, 3, 4, 5, 7, 6, 78};
    System.out.println("by using  for loop");
    for (int i = 0; i<arr1.length;i++) {
        System.out.println(arr1[i]);
    }


    System.out.println("by using reverse for loop");
    for (int i = arr1.length-1; i >=0; i--) {
        System.out.println(arr1[i]);
    }

    int arr2[] = {1, 3, 4, 5, 7, 6, 78};
        System.out.println("by using each for loop");
        for (int element : arr2) {
            System.out.println(element);
        }
    }


}




