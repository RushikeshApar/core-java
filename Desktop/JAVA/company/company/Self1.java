package com.company;
class Employee2{
    int id ;
    String name;
    int salary;

    public void details(){

        System.out.println(name);
        System.out.println(id);
        System.out.println(salary);
    }

}
public class Self1 {
    public static void main (String args[]){
           Employee2 rushikesh = new Employee2();
           Employee2 madhuri = new Employee2();

       rushikesh. id = 13;
        rushikesh.salary = 3000000;
        rushikesh.name = "rushikesh";



       rushikesh.details();
    }
}
