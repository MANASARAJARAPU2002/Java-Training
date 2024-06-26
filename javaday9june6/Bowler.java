package com.hcltech.javaday9june6;

public class Bowler {
	String ball;

	public Bowler() {
		System.out.println("Bowler has " + ball);
	}

	public Bowler(String ball) {
		this.ball = ball;
	}

	public void bowl(String ball) {
		System.out.println("Bowling......");
	}
}
