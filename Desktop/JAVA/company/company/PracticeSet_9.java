package com.company;
class cylinder{
    private int radius;
    private int height;
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }



}
public class PracticeSet_9 {
    public static void main (String args[]){
              //problem no 1
          cylinder mycylinder = new cylinder();

           mycylinder.setHeight(12);
        System.out.println(mycylinder.getHeight());

        mycylinder.setRadius(9);
        System.out.println(mycylinder.getRadius());
    }

    }

