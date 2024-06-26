package com.hcltech.javaday2;

import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter principle amount:");
	  int P = sc.nextInt();
	  System.out.print("Enter Time period:");
	  int T = sc.nextInt();
	  System.out.print("Enter rate of interst:");
	  float R = sc.nextFloat();
	  float S = (P * T * R) / 100;
	  System.out.println("Simple Interest :" + S);
	  sc.close();
	  
	}

}
