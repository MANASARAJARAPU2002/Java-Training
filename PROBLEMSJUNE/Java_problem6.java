package COM.HCLTECH.JAVAPRACTICE.PROBLEMSJUNE;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Java_problem6 {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to print the no of fibanaoic series:");
		int n= sc.nextInt();
		List <Integer>l1 = new ArrayList<>();
		l1.add(a);
		l1.add(b);
		for(int i=2;i<n;i++) {
			int c=a+b;
		    l1.add(c);
			a=b;
			b=c;
			
		}
		System.out.println(l1);

	}

}
