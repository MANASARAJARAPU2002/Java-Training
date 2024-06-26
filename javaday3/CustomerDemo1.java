package com.hcltech.javaday3;

public class CustomerDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerDemo c1 = new CustomerDemo();
		c1.setID(11);
		c1.setName("Manasa");
		c1.setPhoneno("1234567890");
		c1.setPrime(true);
System.out.println("Customer 1 details :" + c1);

CustomerDemo c2 = new CustomerDemo();
c2.setID(12);
c2.setName("Pallavi");
c2.setPhoneno("1234098765");
c2.setPrime(true);
System.out.println("Customer 2 details :" + c2);
if(c1.compareTo(c2)==1)
{
	System.out.println("Both customer object have same data and they are same");
}
else
{
	System.out.println("Both are not same");
}

	}

}
