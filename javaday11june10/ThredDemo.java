package com.hcltech.javaday11june10;

import java.util.Scanner;

class NaturalThread1 extends Thread {

	public void run() {

		for (int i = 1; i <= 10; i++)
			System.out.println(i);
	}}
class EvenThread2 extends Thread {
	public void run() {
		for (int i = 2; i <= 10; i += 2)
			System.out.println(i);
	}}
class OddThread3 extends Thread {

	public void run() {
		for (int i = 1; i < 10; i += 2)
			System.out.println(i);
	}}
public class ThredDemo {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		NaturalThread1 t1 = new NaturalThread1();
		EvenThread2 t2 = new EvenThread2();
		OddThread3 t3 = new OddThread3();
		System.out.println("Menu\n1.Naturalnumbers\n2.Even numbers\n3.Odd numbers\n4.Exit");
		System.out.println("Enter the number between 1-4");
		int choice = sc.nextInt();
		if (choice < 1 || choice > 5)
			System.out.println("Invalid input");
		else {
			switch (choice) {
			case 1:
				t1.start();
				t1.sleep(1000);
				break;
			case 2:
				t2.start();
				t1.sleep(1000);
				break;
			case 3:
				t3.start();
				t1.sleep(1000);
				break;
			case 4:
				System.out.println("Exit");
				break;
			}}}}


