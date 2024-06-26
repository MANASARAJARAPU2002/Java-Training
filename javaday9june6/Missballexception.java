package com.hcltech.javaday9june6;

public class Missballexception extends Exception {
	String msg;

	public Missballexception() {
		msg = "ball missed!";
		System.out.println(msg);
	}

}
