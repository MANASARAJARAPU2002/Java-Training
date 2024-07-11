package COM.HCLTECH.JAVAPRACTICE.PROBLEMSJUNE;

import java.util.Scanner;

public class Java_problem8 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");//enter the number from user
	int num=sc.nextInt();
	int temp=num;//store the num into temp varaiable
	int sum=0;
	while(num!=0) {
		int reg=num%10;//here we are gettng remainder
		sum=(sum*10)+reg;//add that remainder to sum*10
		num=num/10;
	}
	if(sum==temp) System.out.println("polindrome");//compare sum eaquals to temp value
	else System.out.println("Not polindrome");//if not equals else will execute

	}

}
