package com.hcltech.javaday11june10;


class Odd extends Thread {

	public void run() {
		for (int i = 1; i < 10; i += 2) {
			System.out.println(i);
		
		}
		
	}
}
class Even extends Thread {
	public void run() {
		for (int i = 2; i <= 10; i += 2) {
			System.out.println(i);
			
			
		}
	}
}

public class Thread_Demo {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Odd();
		Thread t2 = new Even();
		t1.start();
		t2.start();

	}

}
