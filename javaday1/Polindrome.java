package com.hcltech.javaday1;

import java.util.Scanner;

public class Polindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
	    int num = sc.nextInt();
	    int sum=0;
	    int temp = num;
	    while(num>0)
	    {
	        int res=num%10;
	        sum=(sum*10)+res;
	        num=num/10;
	    }
	    if(temp==sum)
	    
	    System.out.println("It is a polindrome");
	    
	    else
	    
	        System.out.println("It is not a polindrome");
	}
	}




	


