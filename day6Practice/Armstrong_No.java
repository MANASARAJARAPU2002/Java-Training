package com.hcltech.day6Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Armstrong_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = sc.nextInt();
		System.out.println("Enter the Kth number");
		int K = sc.nextInt();
		int arr[] = new int[n];
		boolean f1=false;
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0 ; i<n;i++)
		{
			if(i==K)
			{
				f1=true;
				System.out.println("Kth order elemnt after sort:"+ arr[i]);
				break;
			}
		}		
  if(f1== false)
	System.out.println("Invalid kth number");
	}

}
