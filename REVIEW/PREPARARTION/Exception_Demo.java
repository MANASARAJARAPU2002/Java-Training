package JAVAFINAL.REVIEW.PREPARARTION;

import java.util.Scanner;

class Exceptionnew extends Exception{
	public Exceptionnew(String str) {
		super(str);
	}
}
public class Exception_Demo{
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string1:");
	String str1=sc.next();
	System.out.println("Enter the string2:");
	sc.nextLine();
	String str2=sc.next();
	if(str1.contains(str2))
	{
		System.out.println("String 1 contains :"+ str2);
	}
	else {
		try {
			throw new Exceptionnew("String doesnot contains :"+str2);
		
		}
		
	catch(Exceptionnew e) {
		System.out.println(e);
	}
	}
}
}
