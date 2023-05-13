package com.company;
class dev{

   private int id;
   private String name;

     dev(int id, String name){
      this.id = id;
       this.name = name;
    }

    public int getId() {
        return id;
    }
    public String getName(){
        return name;
    }
}
public class Prectice_Constructor {
    public static void main (String args[]){
        dev d = new dev(5,"rushikesh");
        System.out.println(d.getName());
        System.out.println(d.getId());

    }
}
