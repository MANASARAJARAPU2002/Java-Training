package JAVAFINAL.REVIEW.PREPARARTION;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MIn_difference {

	public static void main(String[] args) {
		List<Integer> arr=new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			arr.add(sc.nextInt());
		}
		mindifference(arr);
	}

	private static int mindifference(List<Integer> arr) {
		int sum=0;
		Collections.sort(arr);
		System.out.println(arr);
for(int i=1;i<arr.size();i++) {
	sum += Math.abs(arr.get(i)-arr.get(i-1));
	
}
System.out.println(sum);
return 1;
	}
		
	}


