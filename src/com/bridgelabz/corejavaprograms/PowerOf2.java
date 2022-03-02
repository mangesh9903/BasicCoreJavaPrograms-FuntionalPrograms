package com.bridgelabz.corejavaprograms;

public class PowerOf2 {

    public static void main(String[] args) {
        int num,num2;
        int mul=1;

        num=Integer.parseInt(args[0]);
        num2=Integer.parseInt(args[1]);
        if( num>0 && num>31)
        {
            System.out.println("Value of number should be less than 31");
        }else
        {
            System.out.println(mul);
            for(int i=1; i<=num; i++)
            {
                mul=mul*2;
                System.out.println(mul);
            }
        }
    }

}
