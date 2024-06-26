package com.hcltech.javaday12june11;

class Twowheeler{
	public static void balance() {
		System.out.println("Balance it...");
	}
	
}

class Bike extends Twowheeler{
	public static void balance() {
		System.out.println("Bike is balanced by ....");
	}
}


public class Overridesstaticdemo {

	public static void main(String[] args) {
		Twowheeler t1= new Bike();
		t1.balance();
	

	}

}
