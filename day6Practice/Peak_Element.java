package com.hcltech.day6Practice;

import java.util.Scanner;

public class Peak_Element {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		//Enter the size of array
		int n = sc.nextInt();
		int p1[] = new int[n];
		boolean flag = false;
		//Enter the array elements 
		System.out.println("Enter the array elements");
		for(int i=0; i<n ;i++)
		{
			p1[i]=sc.nextInt();
			
		}
		//Checking the value greater then neighbor values or not
		for(int i=0 ; i<n ;i++)
		{
			for(int j = i+1;j<n;j++) {
			if(p1[j] > p1[i] && p1[j] > p1[j+1])
			{
				flag = true;
				System.out.println("Peak value is :"+p1[j]);
		
			}
			break;
		}
		}
	
if(flag == false) {
	System.out.println("No peak elemnts :");
}
	}

}
