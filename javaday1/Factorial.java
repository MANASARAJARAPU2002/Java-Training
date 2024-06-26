package com.hcltech.javaday1;

import java.util.Scanner;

public class Factorial {

int Fact()
    {
    int  fact=1;
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter the number:");
    int num=sc.nextInt();
    while(num>0)
    {
        fact = fact*num;
        num--;
    }
    return fact;
}
    
public static void main(String[] args)
{
    Factorial r1 = new Factorial();
    System.out.println(r1.Fact());

}
}

