package JAVAFINAL.REVIEW.PREPARARTION;

import java.util.Scanner;

public class Encrypted_Key {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
			str = sc.nextLine();

			String words[] = str.split("\\s+");
		StringBuffer rev = new StringBuffer();
		for(String name:words) {
			String f1 = name.toLowerCase();
			rev.append(f1+" ");
		}
		StringBuffer r1=rev.reverse();
	   System.out.println(r1);
	}
		

}
