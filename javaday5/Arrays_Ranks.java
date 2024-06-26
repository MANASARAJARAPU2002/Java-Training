package com.hcltech.javaday5;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Ranks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Ranks[] = new int[5];
		// Enter the student ranks
		System.out.println("Enter the Student ranks:");
		for(int i=0 ; i<5 ; i++)
		{
			Ranks[i] =sc.nextInt();
		}
		//Enter the element to match
		System.out.println("Enter the rank:");
		// Sort the array
		Arrays.sort(Ranks);
		int ele = sc.nextInt();
		boolean Iffound = false;
		for(int i=0 ; i<5 ; i++)
		{
			if(Ranks[i]==ele)
			{
			        Iffound = true;
			        break;
			      }
			  }
			    
		if(Iffound)
		      System.out.println("Exist");
		    else
		      System.out.println("Not Exist");
		  }	
	}



