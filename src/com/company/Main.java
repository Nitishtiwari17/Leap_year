package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the year");
        int year=sc.nextInt();
        if((year%400==0)  ||(year%100==0)  || (year%4==0)) {
            System.out.println("this is a leap year:" + year);

        }
        else{
            System.out.println("this is not leap year:"+year);
        }
	// write your code here
    }
}
