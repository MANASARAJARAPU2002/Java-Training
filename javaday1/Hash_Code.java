package com.hcltech.javaday1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hash_Code {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader s1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String:");
		String name = s1.readLine();
		String name2 = s1.readLine();
		
		if(name.equals(name2))
		{
			System.out.println("Both are Same");
			
		}
		else
		{
			System.out.println("Not Same");
		}

		

		

	}

}
