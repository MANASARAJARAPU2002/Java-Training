package com.hcltech.javaday3;

public class CustomerDemo {
	private int ID;
	private String Name;
	private String Phoneno;
	private boolean Prime;
	/**
	 * 
	 */
	public CustomerDemo() {
		super();
	}
	/**
	 * @param iD
	 * @param name
	 * @param phoneno
	 * @param prime
	 */
	public CustomerDemo(int iD, String name, String phoneno, boolean prime) {
		super();
		ID = iD;
		Name = name;
		Phoneno = phoneno;
		Prime = prime;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPhoneno() {
		return Phoneno;
	}
	public void setPhoneno(String phoneno) {
		Phoneno = phoneno;
	}
	public boolean isPrime() {
		return Prime;
	}
	public void setPrime(boolean prime) {
		Prime = prime;
	}
	@Override
	public String toString() {
		return "CustomerDemo [ID=" + ID + ", Name=" + Name + ", Phoneno=" + Phoneno + ", Prime=" + Prime + "]";
	}
	public int compareTo(CustomerDemo c2) {
		
		return 0;
	}
	public void setID1(int iD2) {
		// TODO Auto-generated method stub
		
	}
	public int compareTo1(CustomerDemo c2) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
