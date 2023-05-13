package com.company;
class A{

   public void meth2(){
       System.out.println("im a meth2 of class A");
   }
}

class B extends A{

    public void meth2(){
        System.out.println("im a meth2 of class B");
    }

    public void meth3(){
        System.out.println("im a meth3 of clas B");
    }
}

public class Method_Overriding {
    public static void main (String ags[]){
                A a = new A();
                a.meth2();

                B b = new B();
                b.meth2();
    }
}
