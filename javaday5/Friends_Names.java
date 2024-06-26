package com.hcltech.javaday5;

import java.util.Arrays;
import java.util.Scanner;
public class Friends_Names {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String Frin[] = new String[5];
		
		System.out.println("Enter names");

		// Enter the names 
		for(int i=0 ; i<5 ; i++)
		
 		Frin[i] = sc.nextLine();

		
		System.out.println("Before Sorting");
		for(String f1 : Frin)
			System.out.print(f1+",");
		
		
		System.out.println(" ");
		
		//Sort the array 
		Arrays.sort(Frin);
		System.out.println("After sorting");
		// Display the array
		
		for(String f2: Frin)
		
			System.out.print(f2 +" , "+" ");
		
	}

}
