package com.bridgelabz.corejavaprograms;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {

    public static void main(String args[])
    {
        int head_count=0,tail_count=0;
        double noOfHeads,noOfTails;
        System.out.println("Enter no of times you want to flip  the coin : ");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=0; i<n; i++)
        {
            Random random=new Random();
            int rnum=random.nextInt(2);
            if(rnum< 0.5)
            {
                 tail_count++;
            }else
            {
                head_count++;
            }
        }
        noOfHeads=head_count/(double)n * 100;
        noOfTails=tail_count/(double)n * 100;
        System.out.println(head_count+"  Percentage of Heads: "+noOfHeads+"%");
        System.out.println(tail_count+"  Percentage of Tails: "+noOfTails+"%");
    }
}
