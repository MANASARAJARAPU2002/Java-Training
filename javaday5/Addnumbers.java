package com.hcltech.javaday5;

public class Addnumbers {

			public static void main(int... args) {
				// TODO Auto-generated method stub
				int result1 = add(5,2);
				int result2 = add(1,2,3,4);
				System.out.println(result1);
				System.out.println(result2);

			}
			public static int add(int... numbers)
			{
				int sum=0;
				for(int n:numbers)
				{
					sum+=n;
				}
				return sum;
			}

		}

	


