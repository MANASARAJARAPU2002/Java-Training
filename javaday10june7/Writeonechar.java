package com.hcltech.javaday10june7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Writeonechar {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
  File f1 = new File("data.txt");
  BufferedReader r1 = new BufferedReader(new InputStreamReader(System.in)); 
	//prompt the user
  
  System.out.println("Enter initial letter:");
  
 String s1=r1.readLine();
  
  FileWriter f2 = new FileWriter(f1);
  
  f2.write(s1);
  
  r1.close();
  f2.close();
  System.out.println("character wrote into the file successfully");

}
}
