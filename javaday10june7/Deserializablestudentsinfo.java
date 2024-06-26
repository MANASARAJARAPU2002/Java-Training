package com.hcltech.javaday10june7;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializablestudentsinfo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File file = new File("students.data");
		
		FileInputStream fis = new FileInputStream(file);
		
		
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		try {
			Student first = (Student)ois.readObject();
			Student second = (Student)ois.readObject();
			Student third = (Student)ois.readObject();
			
			
			//set values to properties
			first.getRollno();
			first.getName();
			
			
			second.getRollno();
			second.getName();
			
			third.getRollno();
			third.getName();
			 
			System.out.print("Roll no:"+ first.getRollno()+" ");
			System.out.print("Name:"+ first.getName());
			System.out.println(" ");
			System.out.print("Roll no:"+ second.getRollno()+" ");
			System.out.print("Name:"+ second.getName());
			System.out.println(" ");
			System.out.print("Roll no:"+ third.getRollno()+" ");
			System.out.print("Name:"+ third.getName());
			}
		catch(ClassNotFoundException | IOException e) {
				 e.printStackTrace();
				
			}
		finally {
			
			fis.close();
			ois.close();
			

	}

}
}
