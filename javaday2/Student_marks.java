package com.hcltech.javaday2;


import java.util.Scanner;

public class Student_marks {


public static void main(String args[])
	{
	int sub1,sub2,sub3;
	Scanner sc1 = new Scanner(System.in);

	System.out.print("Enter the Mathsubject Score :");
	sub1 = sc1.nextInt();
	System.out.print("Enter Physics Score :" );
	sub2 = sc1.nextInt();
	System.out.print("Enter the Chemistry Score:");
	sub3 = sc1.nextInt();
   if(sub1<0 || sub2<0 || sub3< 0)
	{
	    System.out.println("Negative marks not allowed");
	}
	else if(sub1 > 100 || sub2>100 || sub3>100)
	{
		if(sub1>100)
		{
			System.out.println("Math score is greater then 100");
		}
		else if(sub2>100)
		{
			System.out.println("Physics score is grater then 100");
		}
		else
		{
			System.out.println("Chemistry score greater then 100");
		}
	}
	else if(sub1> sub2 && sub1>sub3){
	    System.out.println("Math Score is greater then phy and chemistry:" + sub1);
	}
	else if(sub2> sub3 && sub2>sub1)
	{
	    System.out.println("Physics score is greater then maths and chemistry:"+ sub2);
	}
	else 
	{
	    System.out.println("Chemistry score grater then maths and physics:"+ sub3);
	}
	
	}
}









						