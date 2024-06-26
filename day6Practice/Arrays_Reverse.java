package com.hcltech.day6Practice;

import java.util.Scanner;

public class Arrays_Reverse {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int n = sc.nextInt();
		int array[] = new int[n];
		int b1[] = new int[n];
		System.out.println("Enter the elements:");
		  for(int i = 0 ; i<n ; i++)
		  {
			  array[i] = sc.nextInt();
	
		  }
		  for(int i=0;i<n;i++)
		  {
		    for(int j=n-1;j>=0;j--)
					  
			  {
				  b1[j] = array[i];
				  System.out.println(b1[j]+" ");
				  break;
				  
				  
			  }
		    
			  
			  
		  }
		  
		  
	

	}

}
