package com.hcltech.day6Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Kth_No {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		//Enter the size of an array
		System.out.println("Enter the size of an array");
		int n = sc.nextInt();
		//Enter the K value to return
		System.out.println("Enter the Kth number");
		int K = sc.nextInt();
		int arr[] = new int[n];
		
		boolean f1 = false;
		//Enter the elements
		System.out.println("Enter the elements");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		List l1= new LinkedList<>();
		for(int i=0;i<arr.length;i++) {
			l1.add(arr[i]);
		}
		System.out.println(l1);
	
		//checking the kth index
		for (int i = 0; i < n; i++) {
			if (arr[i] == K) {
				f1 = true;
				System.out.println("Kth order elemnt after sort:" + i);
				break;
			}
		}
		if (f1 == false)
			System.out.println("Kth number is not found: ");
		
		}
	}

