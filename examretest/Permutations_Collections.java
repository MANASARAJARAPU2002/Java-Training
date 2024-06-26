package com.hcltech.examretest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations_Collections {

	public List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> list1 = new ArrayList<>();
		// Sort the array
		Arrays.sort(nums);
		boolean[] u1 = new boolean[nums.length];
		// Keep track of used elements
		backtrack(nums, u1, new ArrayList<>(), list1);
		return list1;
	}

	private void backtrack(int[] nums, boolean[] u1, List<Integer> current, List<List<Integer>> solution) {
		if (current.size() == nums.length) {
			solution.add(new ArrayList<>(current));
			return;
		}

		for (int i = 0; i < nums.length; i++) {
			if (u1[i]) {
				// If condition is true it skipps
				continue;

			}
			if (i > 0 && nums[i] == nums[i - 1] && !u1[i - 1]) {
				// If condition is true it skipps the present condition
				continue;
			}

			u1[i] = true;
			current.add(nums[i]);
			backtrack(nums, u1, current, solution);
			u1[i] = false;
			current.remove(current.size() - 1);
		}
	}

	public static void main(String[] args) throws IOException {
		// Use the bufferedReader to take inputs from user in a chareacter stream
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// Enter the number of elemnts menas size
		System.out.println("Enter the number of elements:");
		int n = Integer.parseInt(br.readLine());
		// Create a array with size of n
		int[] nums = new int[n];
		// Enter the elements into array seperated by comma
		System.out.println("Enter the elements:");

		String[] parts = br.readLine().split(",");
		for (int i = 0; i < n; i++) {
			nums[i] = Integer.parseInt(parts[i]);
		}

		// Create object for permutations collections using new keyword
		Permutations_Collections pc = new Permutations_Collections();
		List<List<Integer>> result = pc.permuteUnique(nums);

		System.out.println("Unique permutations:");
		for (List<Integer> permutation : result) {
			System.out.println(permutation);
		}
	}
}
