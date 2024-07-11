package JAVAFINAL.REVIEW.PREPARARTION;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class String_Frequency {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// Enter the string
		System.out.println("Enter the string:");
		String str = br.readLine();
		// Split the String with demiliter as white space
		String[] words = str.split(" ");
		// In first list store the words
		List l1 = new ArrayList<>();
		// In second list store the frequency or count of each word
		List l2 = new ArrayList<>();
		// Check first String is empty or not
		if (str.isEmpty())
			System.out.println("Empty String");
		else {
			// If string is not empty we can go with the else condition
			for (String word : words) {
				// We need to convert the first letter is UpperCase and Remaining letters as
				// lowerCase
				String first_character = word.substring(0, 1).toUpperCase();
				String full_word_is = first_character.concat(word.substring(1).toLowerCase());
				// Add each word After converting into upper and lower to list l1
				l1.add(full_word_is);
			}
			// print the list l1
			System.out.println(l1);		
//take two for loops to check the first word is matches with other words
			for (int i = 0; i < l1.size(); i++) {
				if (!l1.get(i).equals("")) {

					//declare count is 1 bcz we are having atleast one word at 1 time in String
					int count = 1;
					for (int j = i + 1; j < l1.size(); j++) {
						//If first word equals to second word 
						if (l1.get(i).equals(l1.get(j))) {
							//Increment the count
							count++;
							//set the j value due to ignoreing the repeated count
							l1.set(j,"");
						}
					}
					// Add count to the list l2
					l2.add(count);
				}
			}
			System.out.println(l2);
		}
	}
}
