package com.company;
class calculate{

    int age;
    String name;
    calculate( ){
        System.out.println("constructor of super class");
    }

    }
    class Lala{
    public static void main (String args[]){
        calculate f  = new calculate();
        f.name= "don";
        f.age = 24;
        System.out.println(f.age);
        System.out.println(f.name);

    }
    }

