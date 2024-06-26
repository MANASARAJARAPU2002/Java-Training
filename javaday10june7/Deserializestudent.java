package com.hcltech.javaday10june7;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializestudent {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("students.data");
		
		FileInputStream fis = new FileInputStream(file);
		
		
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		try {
			Student std = (Student)ois.readObject();
			System.out.print("Roll no:"+ std.getRollno());
			System.out.print("Name:"+ std.getName());
			}
		catch(ClassNotFoundException | IOException e) {
				 e.printStackTrace();
				
			}
		finally {
			
			fis.close();
			ois.close();
			File file1 = new File("students.data");
			
			FileInputStream fis1 = new FileInputStream(file1);
			
			
			
			ObjectInputStream ois1 = new ObjectInputStream(fis1);
			
			try {
				Student std = (Student)ois1.readObject();
				System.out.print("Roll no:"+ std.getRollno());
				System.out.print("Name:"+ std.getName());
				}
			catch(ClassNotFoundException | IOException e) {
					 e.printStackTrace();
					
				}
			finally {
				
				fis1.close();
				ois1.close();
				
		}
		

	}

	}
}
