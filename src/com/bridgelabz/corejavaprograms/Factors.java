package com.bridgelabz.corejavaprograms;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n=scanner.nextInt();
        int i=2;
        while(n>1){
            if(n%i==0){
                System.out.println(i+" ");
                n=n/i;
            }else
                i++;
        }
        System.out.println(" ");
    }
}
