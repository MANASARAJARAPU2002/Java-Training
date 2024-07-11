package COM.HCLTECH.JAVAPRACTICE.PROBLEMSJUNE;

import java.util.Scanner;

public class Java_problem7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		
		if(num==0 || num<0)
			System.out.println("Invalid input");
		if(num==1 || num==2)
			System.out.println(num+" "+"is Prime");
		else {
			if(num%2!=0 && num%3!=0) {
				System.out.println(num+" "+"is Prime");
			}
			else {
				System.out.println(num+" "+"Not a Prime");
			}
		}
		

	}

}
