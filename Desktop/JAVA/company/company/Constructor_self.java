package com.company;
class  Madhuri{
    int id ;
  String name;
  int salary;

   Madhuri(){      // default constructor. if we don't pass parameters to constructor then  implicitly default
        id = 58;                   // constructor is called (automatically)
        name = "madhuri Apar";
        salary = 4000000;
    }

      //  public Madhuri(String s,int i,int p){   // parameterized constructor.
    // id = i;
    //  name  = s;
      //salary = p;
    //}

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
            return salary;
    }
}

public class Constructor_self {
    public static void main (String args[]){
        Madhuri ma = new Madhuri ();//("rushi",65,8000000); // parameterized constructor.

        System.out.println(ma.getId());
        System.out.println(ma.getName());
        System.out.println(ma.getSalary());
    }
}
