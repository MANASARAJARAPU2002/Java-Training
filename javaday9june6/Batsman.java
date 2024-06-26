package com.hcltech.javaday9june6;

public class Batsman {
	boolean MoodIsGood;

	public void hitBall(boolean MoodIsGood) throws Missballexception {
		if (MoodIsGood) {
			System.out.println("Hitting  six........");

		} else {

			throw new Missballexception();

		}
	}
}
