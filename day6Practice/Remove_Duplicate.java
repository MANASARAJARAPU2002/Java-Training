package com.hcltech.day6Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Remove_Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//Enter the size of an array
		System.out.println("Enter the size of an array");
		int n = sc.nextInt();
		int array[] = new int[n];
		
		//Enter the elements into an array
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		
	
		if(n==0 ||n==1)
		{
			System.out.println(n);
		}
		int j=0;
		for(int i=0 ; i<n-1;i++) {
			if(array[i]!=array[i+1])
			{
				array[j++] = array[i];
			}
		}
		array[j++] = array[n-1];
		System.out.println(j);
	}
}

		