package com.hcltech.javaday11june10;

public class Evennumberdemo {
	static int age=34;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generateEven();
		

	}
	public static void generateEven()
	{
		for(int i=2;i<10;i+=2)
			System.out.println(i);
	}
	static{
System.out.println(age);
}
}
