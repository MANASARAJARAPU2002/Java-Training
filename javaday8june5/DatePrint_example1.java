package com.hcltech.javaday8june5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DatePrint_example1 {

	public static void main(String[] args) throws ParseException, IOException {
		
	BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a date(dd/mm/yy)");
		String datestr =r1.readLine();
		String datestr2 = r1.readLine();
		SimpleDateFormat d1 = new SimpleDateFormat("dd/MM/yyyy");
		Date d2= d1.parse(datestr);
		Date d3 = d1.parse(datestr2);
		System.out.println(d2);
		System.out.println(d3);
		
		
	}

}
