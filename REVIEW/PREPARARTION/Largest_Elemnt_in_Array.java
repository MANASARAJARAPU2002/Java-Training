package JAVAFINAL.REVIEW.PREPARARTION;

import java.util.Scanner;

public class Largest_Elemnt_in_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Enter the size of array
		System.out.println("Enter the size of an array:");
		int n= sc.nextInt();
		int[] arr= new int[n];
		System.out.println("Entre the elemnts:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int max= arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]> max) {
				max= arr[i];
			}
		}
		System.out.println("Largest elemnt:" + max);

	}

}
