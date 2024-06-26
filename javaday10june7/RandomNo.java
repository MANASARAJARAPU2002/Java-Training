package com.hcltech.javaday10june7;
import java.util.Random;
import java.util.Scanner;
public class RandomNo {

	public static void main(String[] args) {
		Random rand = new Random();
		   
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number which to print random number between 0 to n :");
        		int n = sc.nextInt();
        		
        	
        int rand_int1 = rand.nextInt(n);
        
   
        // Print random integers
        System.out.println("Random Integers: "+rand_int1);
     
   

}
}
