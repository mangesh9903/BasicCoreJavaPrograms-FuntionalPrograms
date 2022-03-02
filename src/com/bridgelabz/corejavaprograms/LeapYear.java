package com.bridgelabz.corejavaprograms;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        String str;
        int year , n;

        System.out.println("Enter the Year ");
        Scanner sc=new Scanner(System.in);
                str=sc.next();
                year=Integer.parseInt(str);
                n=str.length();

                if(n!=4)
                {
                    System.out.println("Please enter four digit number");
                }
                else
                {
                    if(year%400==0)
                        System.out.println("Year "+year+"is leap Year");
                    else if(year%100!=0 && year%4==0)
                        System.out.println("Year "+year+" is leap year");
                    else
                        System.out.println("Year "+year+" is not a leap year" );
                }
    }

}
