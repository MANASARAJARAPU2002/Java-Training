package com.hcltech.javaday3;

public class ArraysIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ages[] = new int[3];
ages[0] = 20;
ages[1] = 22;
ages[2] = 23;
for(int ele :ages)
{
	System.out.println(ele);
}
String friend[] = {"pallavi kodela", "manasa rajarapu", "Sailaja Boyapati"};
for(String name : friend)
{
	String names[] = name.split(" ");
	System.out.println(names[0]);
}
	}
}
