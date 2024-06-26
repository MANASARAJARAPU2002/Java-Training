package com.hcltech.day6Practice;

import java.util.Scanner;

public class Tens_code {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = sc.nextInt();
		int sum=0;int temp=30;
		int array[] = new int[n];
		System.out.println("Enter the elements");
		 for(int i=0 ; i<n ; i++)
		 {
			 array[i] = sc.nextInt();
		 }
		 for(int i=0 ; i<n;i++)
		 {
			 if(array[i] == 10)
			 {
				 sum= sum+ array[i];
				
			 }
			 
		 }
		 if(temp == sum)
		 {
			 System.out.println("10's sum is equal to 30");
		 }
		 else
		 {
			 System.out.println("10's sum is not equal to 30");
		 }

	}

}
