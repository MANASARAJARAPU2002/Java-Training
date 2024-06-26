package com.hcltech.javaday10june7;

public class StudentDetails {
	
	private int RollNo;
	private String Name;
	
	
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Override
	public String toString() {
		return "StudentDetails [RollNo=" + RollNo + ", Name=" + Name + "]";
	}
	
 
}
