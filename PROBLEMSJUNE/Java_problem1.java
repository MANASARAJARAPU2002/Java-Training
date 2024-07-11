package COM.HCLTECH.JAVAPRACTICE.PROBLEMSJUNE;

import java.util.Scanner;

public class Java_problem1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		System.out.println("Table of given "+ n +" " +"number");
		for(int i=1;i<=10;i++) {
			System.out.println(n+"*"+i+"="+ n*i);
		}

	}

}
