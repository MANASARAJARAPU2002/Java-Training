package com.hcltech.day6Practice;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Menu\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit");
		System.out.println("Enter the number between 1-5:");
		int choice=sc.nextInt();
		if(a==0 || b==0)
			System.out.println("Invalid input");
		
		switch(choice)
		{
		case 1:System.out.println(a+b);break;
		case 2: 
			if(a>b) System.out.println(a-b); else System.out.println(b-a);break;
		case 3:System.out.println(a*b);break;
		
		case 4:System.out.println(a/b);break;
		case 5:System.out.println("Exit");
		
		}

	}

}
