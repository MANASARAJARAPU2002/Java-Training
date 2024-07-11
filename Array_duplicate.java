package JAVAFINAL.REVIEW.PREPARARTION;

import java.util.Scanner;

public class Array_duplicate {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of an array:");
	int n= sc.nextInt();
	int[] arr= new int[n];
	boolean flag=false;
	 for(int i=0;i<n;i++) {
		 arr[i] = sc.nextInt();
	 }
	 for(int i=0;i<arr.length-1;i++) {
		 if(arr[i] == arr[i+1]) {
			 flag = true;
			 System.out.println(arr[i]+" ");
			
			 
		 }}
	 
	if(flag==false)
		System.out.println("NO duplicate values");

}
}