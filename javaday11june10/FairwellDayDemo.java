package com.hcltech.javaday11june10;

public class FairwellDayDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String greeting = args[0];
		char chars[] = greeting.toCharArray();
		boolean flag=true;
		if(args.length!=0)
		{
			for(char ch:chars) {
				
				if(flag)
				{	
				System.out.println(Thread.currentThread().getName());
				flag =false;
}
			
				System.out.print(ch);
			}
		}
	}
}

		
		
	


