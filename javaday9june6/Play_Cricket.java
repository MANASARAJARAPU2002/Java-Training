package com.hcltech.javaday9june6;

public class Play_Cricket {
	public static void main(String... strings) throws Missballexception {

		Bowler bowler = new Bowler("quark");
		Batsman batsman = new Batsman();

		bowler.bowl("Quark");
		batsman.hitBall(false);

	}
}
