package com.company;
class Parent{
    public void property(){
        System.out.println("GOLD,LAND,BONDS,CARS,INVESTMENTS");
    }
    public void Marry(){
        System.out.println("PUSHPA,MAYA,RANI,CHAYA");   // OLD village girls name
    }
}

class Chiled extends Parent{
    @Override
    public void Marry(){
        System.out.println("NEHA,PRITI,KATRINA");     // URBAN society girls name
    }
}
public class Durga_Overriding {
   public static void main (String args[]){
       Parent p = new Parent();
//       p.property();
       p.Marry();

       Chiled c = new Chiled();
       c.Marry();
       c.property();

   }

}
