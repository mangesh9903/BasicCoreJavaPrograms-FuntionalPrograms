package com.bridgelabz.corejavaprograms;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
      int no=sc.nextInt();
      if(no%2==0)
      {
          System.out.println(no+" is Even Number");
      }
      else {
          System.out.println(no+" is Odd Number");
      }
    }
}
