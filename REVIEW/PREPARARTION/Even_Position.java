package JAVAFINAL.REVIEW.PREPARARTION;

import java.util.Scanner;

public class Even_Position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of an array:");
int n= sc.nextInt();
int[] arr= new int[n];
System.out.println("Enter the elemnts :");
for(int i=0;i<n;i++) {
	arr[i] = sc.nextInt();
}
System.out.println("Even position:");
for(int i=0;i< arr.length;i+=2) {
	System.out.println(arr[i]+" ");
}

	}

}
