package com.company;

public class Chapter_7_Method {
    static void name(){
        System.out.println("im the best ..");
    }
    static void change (int []arr){
         arr[0] =100;
    }
    public static void main (String args[]){
       // name();
        int [] marks = {23,45,67,34,25,68,6,};
         change(marks);
        System.out.println(marks[0]);

    }
}
