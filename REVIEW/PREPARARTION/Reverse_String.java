package JAVAFINAL.REVIEW.PREPARARTION;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reverse_String {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		 for(int i=str.length()-1;i>=0;i--) {
			 System.out.print(str.charAt(i));
			 
		 }
	}

}
