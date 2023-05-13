package com.company;

public class Finally {
    public static int greet(){
        try{
            int a = 12;
            int b = 0;
            int c = a/b;
            return c;  // if exception not occurred then return c is happen and closed but if we put finally
        }              // in this block we code or write that which we want must ether exception occurred or not
        catch (Exception e){
            System.out.println(e);
    }
        finally {  // in this block we code or write that which we want must ether exception occurred or not
            System.out.println("cleaning up reassures .... this is the ending of this function");
       }
       return -1;
        }
        public static void main (String args[]){

        int k = greet();
            System.out.println(k);
        }
}
