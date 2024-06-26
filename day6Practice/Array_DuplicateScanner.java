package com.hcltech.day6Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Array_DuplicateScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Enter the size of an array
		System.out.println("Enter the size of an array");
		int n = sc.nextInt();
		int array[] = new int[n];
		int count =0;
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			array[i] = sc.nextInt();
		}
		//Sort the array
		Arrays.sort(array);
		// checking the elements are same or not if same return the element
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(array[i] == array[j])
				{
					count++;
					System.out.println("Duplicate element is:"+ array[i]);
					break;
				}
			}
		}
		// If their is no duplicates then if block will execute
		if(count ==0)
		{
			System.out.println("No duplicate elmements");
		}
System.out.println("Array length after remove duplicates:"+ (n-count));
	}

}
