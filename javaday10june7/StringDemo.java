package com.hcltech.javaday10june7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String firstname;
		String lastname;
		StringBuilder name;
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter first name:");

firstname = br.readLine();
System.out.println("Enter second name:");
lastname=br.readLine();

System.out.println("Name:"+ firstname +" "+ lastname);


name = new StringBuilder(firstname.concat(" ").concat(lastname));
System.out.println("After storing name object ,name=:"+name);
System.out.println("name become upper letter:"+ firstname.toUpperCase());
System.out.println("length of last name:"+ lastname.length());



if(firstname.equalsIgnoreCase("Manasa"))
{
	System.out.println("hi friends");
}
else
{
	System.out.println("Welcome");
}

String partofname =lastname.substring( 0,4);
System.out.println(partofname);

if(firstname==lastname)
{
	System.out.println("both are same having same object");
}
else if(firstname.equals(lastname))
{
	System.out.println("both are same");
}
else 
{
	System.out.println("Not same");
}

		}

}
