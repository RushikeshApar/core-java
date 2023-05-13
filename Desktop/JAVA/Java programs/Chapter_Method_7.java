package com.company;

public class Chapter_Method_7 {

    static   int  logic(int x, int y){
        int z;                       //  Static key word is associated with hole class.
                                      // we can also call method by creating boj of the class.we no need static key word
        if(x>y){
            z = x + y + 2;
        }
        else{
            z = x + y - 3;
        }
        return z;
    }
    public static void main (String args[]){
//       method invocation using object creation.(if method is non static)
//      Chapter_Method_7 obj = new Chapter_Method_7();   creating a object of the class if no use static method .
//      int c = obj.logic( a, b);

        int a = 2;
        int b = 12;
        int c = logic( a, b);
        System.out.println(c);

        int a1 =3;
        int b1=4;
        int c1 = logic(a1,b1);

        int a2 = 72;
        int b2 = 62;
        int c2 = logic(a2,b2);
    }
}
