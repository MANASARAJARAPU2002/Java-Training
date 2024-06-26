package com.hcltech.javaday3;

import java.util.Arrays;

public class PlayerRuns_Sort {

public static void main(String[] args) 
		 {
		 int Runs[] = {57,23,89,102,200};
		 System.out.println("Runs Before sorting");
		for(int Play : Runs)
		{
			System.out.print(Play+" ");
		}
		 System.out.println(" ");
		 System.out.println("Runs After sorting");
		 Arrays.sort(Runs);
		 showArray(Runs);
			}
			public static void showArray(int Runs[])
			{
				for(int  Run: Runs)
				{
					System.out.print(Run+" ");
				}
			}

		

	}


