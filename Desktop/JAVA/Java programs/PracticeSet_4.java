package com.company;
import java.util.Scanner;

public class PracticeSet_4 {
    public static void main(String args[]) {
//                quastion 1 check a is equals to 12
//        int a =12;
//        if (a=12){    // (=) is assign operator and ( == )is equals to operator
//            System.out.println("is equal");
//        }
//        else{
//            System.out.println("not equal");
//        }

//                  quastion 2 // your avg is greater than 40 and and in each sub 3 marks
//                                 are required
       /*  int sub1,sub2,sub3;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your sub1 marks");
        sub1 = sc.nextByte();

        System.out.println("enter your sub2 marks");
        sub2 = sc.nextByte();

        System.out.println("enter your sub3 marks");
        sub3 = sc.nextByte();

        float avg = (sub1+sub2+sub3)/3.0f;
        System.out.println("your avarage is : " + avg);

        if (avg>=40 && sub1>=33 && sub2>=33 && sub3>=33){
            System.out.println("congratulations your pass");
        }
        else{
            System.out.println("Soory , try next time");
        }*/

        // calculate the tax of employee

//               Scanner sc = new Scanner(System.in);
//        System.out.println("enter your income in lacs per annum");
//        float tax = 0 ;
//        float income = sc.nextFloat();
//        if (income<=2.50000) {
//            tax = tax + 0;
//        }
//        else if (income>2.50000f && income <=500000f){
//            tax = 0.05f * (income - 2.50000f);//you  pay 5% of tax for 2.5 to 5 lac income per annum
//        }
//        else if(income>500000f && income<=10.00000f){
//             tax = tax + 0.2f * (income-500000f);// you pay 20% of tax for 5 to 10 lac income per anuum
//            tax = tax + 0.05f * (income - 2.50000f);// you also pay 5% of tax for 2.5 to 5 lac income per annum
//        }
//        else if (income>=1000000f){
//            tax = tax + 0.2f * (income-500000f);// you pay 20% of tax for 5 to 10 lac income per anuum
//            tax = tax + 0.05f * (income - 2.50000f);// you also pay 5% of tax for 2.5 to 5 lac income per annum
//            tax = tax + 0.3f * (income - 1000000f);// you also pay 30% of tax for greater than 10 lac income per annum
//        }
//        System.out.println(" Total tax paid by employee is  : " + tax);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number for checking day on it : ");
//        int day = sc.nextInt();
////          int day =7;
//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("wrong case");
//        }

//                    question  5 find given year is leap year or not
        // their is two condition are present to find leap year
        //condition 1 - the year is divisible by 400 is definitely Leap year(year % 400 == 0)
        //condition 2 - year is divisible by 4 and not divisible by 100(year % 4 == 0 && year % 100 !=0)
//        int year ;
//        System.out.println("Enter an year");
//        Scanner sc = new Scanner(System.in);
//        year = sc.nextInt();
//
//        if (((year % 4 == 0)&&(year % 100 != 0)) || ((year % 400 == 0))){
//                System.out.println("Specified year is Leap year ");
//        }
//        else {
//            System.out.println("Specified year is not Leap year ");
//        }
//              question 6 check web site type
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter website name here ");
        String website = sc.next();
        if (website.endsWith(".org") ){
            System.out.println("this is an organizational website");
        }
        else if (website.endsWith(".com")){
            System.out.println("this is an commercial website");
        }
        else if (website.endsWith(".in")){
            System.out.println("this is an indian website");
        }

    }
}



