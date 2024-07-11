package JAVAFINAL.REVIEW.PREPARARTION;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Second_largest_elemnt {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of array:");
		int n= Integer.parseInt(br.readLine());
		int[] arr= new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
			if(arr[i] > arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
			
		}
		}
		System.out.println("Second largest:"+arr[n-2]);

	}

}
