package com.company;
class MyMainEmployee{
    private  int id;
    private  String name;
     private int salary ;

    public MyMainEmployee(){
       id = 51;               // default constructor
        name = "harry bhai";
        salary = 120000;

    }

     public MyMainEmployee(String myname,int myid,int mysalary){
       id = myid;        //parametrized constructor
        name = myname;
        salary = mysalary;
   }

    public void setName(String n){
      this.name = n;
    }
    public String getName(){
        return name;
    }

    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }

    public void setSalary(int s){
        this.salary = s;
    }
    public int getSalary(){
        return salary;
    }
}
public class Constructor {
    public static void main (String args[]){

//        MyMainEmployee harry= new MyMainEmployee("programing with harry",41,2200000); // its called parametrize constructor
        MyMainEmployee harry= new MyMainEmployee(); // its called default constructor
        // harry.setName("CodeWithHarry");
        // harry.setId(32);
        //harry.setSalary(2324);


        System.out.println(harry.getName());
        System.out.println(harry.getId());
        System.out.println(harry.getSalary());
    }
}
