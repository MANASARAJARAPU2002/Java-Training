package com.hcltech.examretest;

import java.util.Scanner;

public class ZigZag_Pattern {

			public static void main(String[] args) { 
				//Taking scanner to read input from user
				Scanner scanner = new Scanner(System.in); 
				System.out.print("Enter the string: "); 
				//Take a string
				String s = scanner.nextLine(); 
				//Enter the number of rows
				System.out.print("Enter the number of rows: "); 
				int numRows = scanner.nextInt(); 
				String result = convertToZigZag(s, numRows); 
				System.out.println("Zigzag pattern: \n" + result);
				} 
			public static String convertToZigZag(String s, int numRows)
			{ //Checking condition
				if (numRows == 1 || s.length() <= numRows) { 
					return s;
				}
				//array of rows using string builder
				StringBuilder[] rows = new StringBuilder[numRows]; 
				for (int i = 0; i < numRows; i++) 
				{ 
					rows[i] = new StringBuilder(); 
				} 
				//current row is 0
				int currentRow = 0; 
				boolean goingDown = false; 
				for (char c : s.toCharArray())
				{ 
					rows[currentRow].append(c);
					if (currentRow == 0 || currentRow == numRows - 1)
					{ 
						goingDown = !goingDown; 
					} 
					currentRow += goingDown ? 1 : -1;
					} 
				//Store the input in aresult and display
				StringBuilder result = new StringBuilder();
				for (StringBuilder row : rows) { 
					result.append(row);
					} 
				return result.toString(); 
}}
	
