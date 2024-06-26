package com.hcltech.javaday10june7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentSerializable {

	public static void main(String[] args) throws IOException {
		
		Student first = new Student();
		Student second = new Student();
		Student third=new Student();
		
		//set values to properties
		first.setRollno(116);
		first.setName("Manasa");
		
		
		second.setRollno(117);
		second.setName("Pallavi");
		
		third.setRollno(118);
		third.setName("sailu");
		 
		
		//create file object
		File f1 = new File("Stuinfo.txt");
		//create file output stream object to write into a file
		
	FileOutputStream fos = new FileOutputStream(f1);
	
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	
	//Write the object from heap memory to persistent location(hard disk)
	
	oos.writeObject(first);
	oos.writeObject(second);
	oos.writeObject(third);
	
	System.out.println("Student object written to a file called stuinfo.dat");
	fos.close();
	oos.close();


	}

}
