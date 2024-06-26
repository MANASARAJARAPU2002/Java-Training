package com.hcltech.javaday10june7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializestudent {

	public static void main(String[] args) throws IOException {

		Student firststudent = new Student();
		//set values to properties
		firststudent.setRollno(116);
		firststudent.setName("Manasa");
		
		//create file object
		File f1 = new File("students.data");
		//create file output stream object to write into a file
		
	FileOutputStream fos = new FileOutputStream(f1);
	
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	
	//Write the object from heap memory to persistent location(hard disk)
	
	oos.writeObject(firststudent);
	System.out.println("Student object written to a file called student.dat");
	fos.close();
	oos.close();

	}

}
