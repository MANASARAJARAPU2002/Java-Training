package JAVAFINAL.REVIEW.PREPARARTION;

import java.util.Scanner;

public class Reverse_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int n= sc.nextInt();
		int[] arr= new int[n];
		System.out.println("Enter the elements into array:");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		
 for(int i=arr.length-1;i>=0;i--)
	 System.out.println(arr[i]+" ");
	}

}
