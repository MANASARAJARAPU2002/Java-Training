package com.hcltech.javaday3;

public class ArrayDemo {
	
	
	public static void display(String gender ,String students[][])
	{
		int gendercount=0;
		if(gender.equals("girls"))
		{
			System.out.println("Girls");
			gendercount++;
		}
		else
		{
			System.out.println("Boys");
		}
		for(int i = gendercount; i<gendercount+1 ; i++)
		{
			for(int j =0;j<4 ;j++)
			{
				System.out.println(students[i][j]);
			}
		}
	}
	public static void main(String[] args) {
	

	}

}
