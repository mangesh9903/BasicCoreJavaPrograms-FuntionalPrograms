package com.bridgelabz.functionalprogramming;

import java.util.Scanner;

public class TwoDArray {

    Scanner sc = new Scanner(System.in);

    public void readIntArray() {
        System.out.println("Enter the Values: ");
        int[][] d = {{sc.nextInt(), sc.nextInt()}, {sc.nextInt(),sc.nextInt()}};

        System.out.println("Two D Array of Double.");
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++)
            {
                System.out.print(d[i][j]+" ");
            }   System.out.println();
        }
    }

    public void readDoubleArray() {
        System.out.println("Enter the Values: ");
        double[][] d = {{sc.nextDouble(), sc.nextDouble()}, {sc.nextDouble(),sc.nextDouble()}};

        System.out.println("Two D Array of Double.");
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++)
            {
                System.out.print(d[i][j]+" ");
            }   System.out.println();
        }

    }

    public void readBooleanArray() {
        System.out.println("Enter the Values: ");
        boolean[][] d = {{sc.nextBoolean(), sc.nextBoolean()}, {sc.nextBoolean(),sc.nextBoolean()}};

        System.out.println("Two D Array of Double.");
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++)
            {
                System.out.print(d[i][j]+" ");
            }   System.out.println();
        }

    }

    public static void main(String[] args) {
        TwoDArray twoDArray=new TwoDArray();

        twoDArray.readIntArray();
        twoDArray.readDoubleArray();
        twoDArray.readBooleanArray();
    }
}
