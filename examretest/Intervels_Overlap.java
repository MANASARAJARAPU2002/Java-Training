package com.hcltech.examretest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intervels_Overlap {
	public int[][] merge(int[][] intervals) {
		if (intervals.length == 0) {
			return new int[0][];
		}

		// Sort the intervals based on the start time
		Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
		// Creating list because from input it is informe of list
		List<int[]> L1 = new ArrayList<>();

		// Iterate through the sorted intervals and merge them
		for (int[] interval : intervals) {
			// If the list of merged intervals is empty or if the current interval does not
			// overlap with the previous one
			if (L1.isEmpty() || L1.get(L1.size() - 1)[1] < interval[0]) {
				L1.add(interval);
			} else {
				// There is an overlap, so we merge the current interval with the previous one
				L1.get(L1.size() - 1)[1] = Math.max(L1.get(L1.size() - 1)[1], interval[1]);
			}
		}

		return L1.toArray(new int[L1.size()][]);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// Enter the no of intervels
		System.out.println("Enter the number of intervals:");
		int n = Integer.parseInt(reader.readLine());

		int[][] intervals_overlap = new int[n][2];

		// Enter the intervels starting and ending
		System.out.println("Enter the intervals (start and end):");
		// USING LOOP TAKING INPUTS FROM USER
		for (int i = 0; i < n; i++) {
			String[] parts = reader.readLine().split(" ");
			intervals_overlap[i][0] = Integer.parseInt(parts[0]);
			intervals_overlap[i][1] = Integer.parseInt(parts[1]);
		}
		// Creating object for the Intervels_Overlap using new keyword

		Intervels_Overlap obj1 = new Intervels_Overlap();
		int[][] mergedIntervals = obj1.merge(intervals_overlap);
		// Print the intervels after merging
		System.out.println("Merged intervals:");
		for (int[] interval : mergedIntervals) {
			System.out.print(Arrays.toString(interval) + " ");
		}
	}
}
