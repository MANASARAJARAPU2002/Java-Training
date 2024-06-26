package com.hcltech.javaday9june6;

import java.util.Scanner;

// Take two int numbers and print the remainder of two numbers where first number divide with second
public class Remainder_print {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Take inputs from the user using Scanner

		System.out.println("Enter the  two numbers:");
		int f1_No = sc.nextInt();
		int f2_No = sc.nextInt();

		try {

			float f3_No = f1_No % f2_No;
			System.out.println("Remainder of two numbers is:" + f3_No);

		} catch (Exception e) {
			System.out.println("Exception occured");
		} finally {

			System.out.println("Rest of the code");

		}

	}

}
