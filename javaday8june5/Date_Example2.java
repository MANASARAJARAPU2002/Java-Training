package com.hcltech.javaday8june5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Example2 {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
		
		
	BufferedReader b1 = new BufferedReader(new InputStreamReader(System.in));
	String date1 = b1.readLine();
	String date2 = b1.readLine();
	SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
	Date d1 = date.parse(date1);
	Date d2 = date.parse(date2);
	System.out.println(d1);
	System.out.println(d2);
	

	}

}
