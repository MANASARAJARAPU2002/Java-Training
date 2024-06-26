package com.hcltech.day6Practice;

class Inherit {
		  void Display()
		  {
			  System.out.println("Hello");
		  }
	 }
	  class Two extends Inherit{
		  void Display()
		  {
			  System.out.println("Hi");
		  }
		public static void main(String[] args) {
			
			Two obj1 = new Two();
			System.out.println();
			
		}

	}
