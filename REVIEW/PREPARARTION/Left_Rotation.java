package JAVAFINAL.REVIEW.PREPARARTION;

import java.util.Scanner;

public class Left_Rotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int n= sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter no of rotations:");
		int m=sc.nextInt();
		System.out.println("Enter the elemnts:");
	for(int i=0;i<n;i++) {
		arr[i]= sc.nextInt();
	}
	for(int i=0;i<m;i++) {
		int j,first=arr[0];
		for( j=0;j<arr.length-1;j++) {
			arr[j]= arr[j+1];
		}
		arr[j]=first;
	}
	System.out.println("Elements after shift left:");
	for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
}
}
