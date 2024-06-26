package com.hcltech.javaday4;

//Method Overloading  //

public class Runtime_polydemo {

public static void main(String[] args) {
		// TODO Auto-generated method stub
int firstno ,secondno,result;
Calculate  calci = new Calculate();
if(args.length==2)
{
	try
	{
	firstno = Integer.parseInt(args[0]);
	secondno = Integer.parseInt(args[1]);
	}catch(Exception e)
	{
		firstno = Integer.parseInt(args[0]);
		secondno = Integer.parseInt(args[1]);
		
	}
	result= calci.add(firstno,secondno);
	System.out.println(result);
}
	}

}
