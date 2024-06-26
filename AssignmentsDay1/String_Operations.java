package com.hcltech.AssignmentsDay1;

public class String_Operations {

	public static void main(String[] args) {
		String str1= " Manasa Rajarapu ";
		String str2="nasa";
		if(str1.isEmpty()) System.out.println(" empty");
		else  System.out.println("Not empty");
		
		 if(str1.contains(str2)) System.out.println("true");
		 else System.out.println("False");
		
		if(str1==str2) System.out.println("Same");
		else System.out.println("Both are not same");
		
		 if(str1.equals(str2)) System.out.println("both are same ");
		 else System.out.println("not same");
		 int index=str1.indexOf('a');
		int index2 = str1.indexOf(str2);
		
		String str3 = str1.toUpperCase();
	    System.out.println(index);
	    System.out.println(index2);
	    System.out.println(str3);
	    str1.trim();
	   
	}
}