package com.hcltech.javaday11june10;

public class StringDemo {

	public static void main(String[] args) {
	String str1 ="Good Morning";
	StringBuffer str2 = new StringBuffer(str1);
	String strr3="od";
	
	for(int i=0;i<str1.length();i++)
	{
		if(Character.isUpperCase(str1.charAt(i)))
			str2.setCharAt(i,Character.toLowerCase(str1.charAt(i)));
		
		else if(Character.isLowerCase(str1.charAt(i)))
			str2.setCharAt(i, Character.toUpperCase(str1.charAt(i)));
		
	}
	System.out.println("Coverted String:"+ str2);
	
	boolean s1 = str1.contentEquals(strr3);
	System.out.println(s1);
	}
}