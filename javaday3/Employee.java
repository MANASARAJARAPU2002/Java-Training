package com.hcltech.javaday3;
 // bean
public class Employee {
	//all members must be private
	private int Employee_Id;
	private String Name;
	private float Salary;
	private float Bonus;
	public Employee() {
		super();
	}

	public int getEmployee_Id() {
		return Employee_Id;
	}



	public void setEmployee_Id(int employee_Id) {
		Employee_Id = employee_Id;
	}



	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public float getSalary() {
		return Salary;
	}



	public void setSalary(float salary) {
		Salary = salary;
	}



	public float getBonus() {
		return Bonus;
	}



	public void setBonus(float bonus) {
		Bonus = bonus;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
