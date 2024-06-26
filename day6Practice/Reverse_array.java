package com.hcltech.day6Practice;

import java.util.Scanner;

public class Reverse_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of an array");
int n = sc.nextInt();
int a[] = new int[n];
System.out.println("Enter the elements");
 for(int i =0 ; i<n ; i++)
 {
	 a[i] = sc.nextInt();
 }
    
 
 for(int i= a.length-1;i>=0 ;i--)
 {
	 System.out.println(a[i]);
	
 }
	}
}