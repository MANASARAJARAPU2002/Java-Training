package com.hcltech.javaday3;

import java.util.Arrays;

public class PricesSort {

 public static void main(String[] args) 
 {
 int prices[] = {57,23,89,102,200};
 
 System.out.println("After sorting");
 Arrays.sort(prices);
 showArray(prices);
	}
	public static void showArray(int prices[])
	{
		for(int  price: prices)
		{
			System.out.print(price + " ");
		}
	}

}
