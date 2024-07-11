 package COM.HCLTECH.JAVAPRACTICE.PROBLEMSJUNE;

import java.util.Scanner;

public class Java_problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the radius:");
float radius =sc.nextFloat();
final double pi=3.14;
double circle_area=2*pi*radius*radius;
System.out.println("Area of the circle:"+circle_area);

System.out.println("Area of the circle:"+Math.ceil(circle_area));

	}

}
