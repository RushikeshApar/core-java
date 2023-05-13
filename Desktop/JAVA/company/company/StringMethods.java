package com.company;

public class StringMethods {
    public static void main (String args[]) {
      String name1 = "rushikesh";
//        int value = name1.length();
//        System.out.println(value); //or by System.out.println(name1.length());to find lenght

//        String a = name1.toUpperCase(); //or System.out.println(name1.toUpperCase())
//        System.out.println(a);         // for converting in to upper case


        String name2 = "RUSHIKESH";
//        String b = name2.toLowerCase();//System.out.println(name2.toLowerCase())
//        System.out.println(b);        //convert in to lover case

//        String name3 ="Anna";     // to cut all blank space from
//        System.out.println(name3.trim());
//                  rushikesh
//                  012345678
//        System.out.println(name1.substring(4));//print string from that index point
       System.out.println(name1.substring(1,4));//start consider & end not consider

        System.out.println(name2.replace('R','p')); //Replace the char with new char
//        System.out.println(name2.replace("RUSHI","ankoo"));

//        System.out.println(name2.startsWith("R"));//return boolean
//        System.out.println(name2.endsWith("H"));//return boolean

//        System.out.println(name2.charAt(2));// index count from 0 and return char at that index number
//        System.out.println(name2.indexOf("S"));
//        System.out.println(name2.indexOf("S", 4));//search char from at this index point

//        System.out.println(name2.lastIndexOf("H"));//search char from last end of string
//        System.out.println(name2.lastIndexOf("H",4));//search char from given index number

        System.out.println(name2.equals("RUSHi"));// match the String
//        System.out.println(name2.equalsIgnoreCase("rushikesh"));//ignore case sensitivity of java
    }
}



