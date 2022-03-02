package com.bridgelabz.functionalprogramming;

import java.util.Scanner;

public class Quadratic {

    public double findDelta(int a, int b , int c){
        double delta=(b*b - 4*a*c);
        return delta;
    }

    public double quadracticEquation1(int a, int b,int c)
    {

       double sqrtOfDelta=Math.sqrt(findDelta(a,b,c));
        double equation1=(-b + sqrtOfDelta )/(2*a);
        return equation1;
    }
    public double quadracticEquation2(int a, int b,int c)
    {

        double sqrtOfDelta=Math.sqrt(findDelta(a,b,c));
        double equation2=(-b - sqrtOfDelta )/(2*a);
        return equation2;
    }


    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter A value:");
        int a= scanner.nextInt();
        System.out.println("Enter B value:");
        int b= scanner.nextInt();
        System.out.println("Enter C value:");
        int c=scanner.nextInt();



        Quadratic quadratic=new Quadratic();
         double equation1=quadratic.quadracticEquation1(a,b,c);
         double equation2=quadratic.quadracticEquation2(a,b,c);
        System.out.println("Root 1 of X : "+equation1);
        System.out.println("Root 2 of X : "+equation2);
    }
}
