package com.hcltech.javaday5;

public class Bird {
	public static int legs;
	private static int wings;
	
	
	private String birdName;
	private String birdColor;
	private boolean Singing;
	


	public static int getLegs() {
		return legs;
	}



	public static void setLegs(int legs) {
		Bird.legs = legs;
	}



	public static int getWings() {
		return wings;
	}



	public static void setWings(int wings) {
		Bird.wings = wings;
	}



	public String getBirdName() {
		return birdName;
	}



	public void setBirdName(String birdName) {
		this.birdName = birdName;
	}



	public String getBirdColor() {
		return birdColor;
	}



	public void setBirdColor(String birdColor) {
		this.birdColor = birdColor;
	}



	public boolean isSinging() {
		return Singing;
	}



	public void setSinging(boolean singing) {
		Singing = singing;
	}
// Can walk
public void walk()
{
	System.out.println("Walking with "+ legs+" legs.");
}
// can fly
public void fly()
{
	System.out.println("Flying with wings " +wings+" wings." );
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
