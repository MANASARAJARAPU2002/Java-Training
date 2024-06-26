package com.hcltech.day6Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of an array:");
		int n = Integer.parseInt(r1.readLine());
		int arr[] = new int[n];
		 
		//taking the elements into an array
		
		for(int i=0 ; i<n;i++)
		{
			arr[i] = Integer.parseInt(r1.readLine());
		}
		Arrays.sort(arr);
		System.out.println("Second largest element :"+arr[n-2]);

	}

}
