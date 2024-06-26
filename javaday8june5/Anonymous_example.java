package com.hcltech.javaday8june5;

import java.util.Scanner;

abstract class Show{
	abstract void display(); 
}

public class Anonymous_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
		
		Show sh = new Show(){
 
				  void display()
				  {
					  System.out.println("Enter name:");
					  int arr[] = new int[5];
					  for(int i=0;i<5;i++)
					  {
						  System.out.println(arr[i]+" ");
					  }
					  }  
				  }; 
				  sh.display();  

				
		}
		
	}

