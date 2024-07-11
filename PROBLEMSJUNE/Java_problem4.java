package COM.HCLTECH.JAVAPRACTICE.PROBLEMSJUNE;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Java_problem4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar= new int[3];
		int sum=0;
		int count=1;
		for(int i=0;i<3;i++) {
			System.out.println("Enter the "+count++ +" number");
			ar[i]=sc.nextInt();
		}
		for(int i:ar) {
			sum=sum+i;
			
		}
		int avg= sum/3;
		System.out.println("Average :"+ avg);
	}

}
