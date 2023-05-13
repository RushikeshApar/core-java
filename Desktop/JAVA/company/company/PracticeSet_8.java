package com.company;

class Employee3{
String name;
int salary;

public void setName(String s ){
    name= s;
}
public String getName(){
    return name;
}
public void setSalary(int n ){
    salary = n;
}
public int getSalary(){
    return salary;
}
}
class mobile{
    public void calling(){
        System.out.println("calling friend...");
    }
    public void ringing(){
        System.out.println("ringing mobile...");
    }
    public void vibrateing(){
        System.out.println("vibrating mobile...");
    }
}
class Square1{
    int side;
    public int area1(){
        return side*side;
    }

    public int perimeters1(){
        return 4*side;
    }

}
class Tommy1{
    public void run1(){
        System.out.println("tommy is running");
    }

    public void hit1(){
        System.out.println("tommy hits enemy");
    }
    public void hide(){
        System.out.println("tommy hiding from enemy");
    }
}

public class PracticeSet_8 {
    public static void main (String args[]){
////        problem 1
//        Employee3 rush = new Employee3();
//
//        rush.setName("rushikesh");
//        System.out.println(rush.getName());
//
//          rush.setSalary(3435000);
//        System.out.println(rush.getSalary());
//
////          problem 2
//        mobile honor = new mobile();
//        honor.calling();
//        honor.ringing();
//        honor.vibrateing();

//          problem 3
//        Square1 rq = new Square1();
//        rq.side = 3;
//        System.out.println(rq.area1());
//        System.out.println(rq.perimeters1());

//                problem 3

        Tommy1 player2 = new Tommy1();
        player2.run1();
        player2.hit1();
        player2.hide();


    }
}
