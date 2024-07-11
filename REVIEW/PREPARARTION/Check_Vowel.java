package JAVAFINAL.REVIEW.PREPARARTION;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Check_Vowel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String s2=str.toUpperCase();
		Set s1 = new HashSet<>();
		if(str.isEmpty())
			System.out.println("String is empty");
		
		else {
			System.out.println(s2);
			for(int i=0;i<s2.length();i++) {
				if(s2.charAt(i)=='A' ||s2.charAt(i)=='E'||s2.charAt(i)=='I'||s2.charAt(i)=='O'||s2.charAt(i)=='U') {
					s1.add(s2.charAt(i));
				}
				}
			if(s1.isEmpty()) 
				System.out.println("The String does not contains Vowels");
			
			else {
				System.out.print("Contains:"+"");
				Iterator it=s1.iterator();
				while(it.hasNext())
					System.out.print(it.next()+",");
			}
		}
	}

}
