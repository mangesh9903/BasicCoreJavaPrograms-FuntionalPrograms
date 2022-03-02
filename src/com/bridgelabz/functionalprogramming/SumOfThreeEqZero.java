package com.bridgelabz.functionalprogramming;

import java.util.Scanner;

public class SumOfThreeEqZero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the values 5 values");
        int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
        int n = arr.length;

        SumOfThreeEqZero sumOfThreeEqZero = new SumOfThreeEqZero();
        sumOfThreeEqZero.findSumOfThreeEqZero(arr, n);


    }

    public void findSumOfThreeEqZero(int[] arr, int n) {
        boolean found = false;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.print(arr[i] + " ");
                        System.out.print(arr[j] + " ");
                        System.out.print(arr[k]);
                        System.out.print("\n");
                        found = true;
                    }
                }
            }
        }

        if(found==false){
            System.out.println("Not Found Sum of Three Digit");
        }

    }
}
