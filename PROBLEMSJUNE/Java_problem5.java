package COM.HCLTECH.JAVAPRACTICE.PROBLEMSJUNE;

import java.util.Scanner;

public class Java_problem5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a<0 && b<0)
			System.out.println("numbers are -ve values ");
		else {
			a=a+b;
			b=a-b;
			a=a-b;
		
		}
		System.out.println(a);
		System.out.println(b);
		
		

	}

}
