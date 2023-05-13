package com.company;
class MyEmployee{
  private  int id;
  private  String name;

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
}
public class Chapter_9_AccessModifier {
    public static void main (String args[]){
        MyEmployee harry = new MyEmployee();
//        harry.id= 34;                  ----> error shows due to privet accessModifier
//       harry.name="CodeWithHarry";

        harry.setName("CodeWithHarry");
        harry.setId(1);

        System.out.println(harry.getName());
        System.out.println(harry.getId());
    }
}
