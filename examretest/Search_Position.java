package com.hcltech.examretest;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Search_Position {
	
	
	    public int searchInsert(int[] array, int target) {
	        int left_position = 0;
	        int right_position = array.length - 1;
	        
	        while (left_position <= right_position) {
	            int mid = left_position + (right_position - left_position) / 2;
	            
	            if (array[mid] == target) {
	                return mid;
	            } else if (array[mid] < target) {
	                left_position = mid + 1;
	            } else {
	                right_position = mid - 1;
	            }
	        }
	        
	        return left_position;
	    }
	 
	    public static void main(String[] args) throws IOException {
	    	//Here we are using buffered reader to take inputs from the user
	        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 
	        // Enter  the array size
	        System.out.print("Enter the size of the array: ");
	        int size = Integer.parseInt(br.readLine());
	
	 
	        // Enter  the array elements
	        int[] a1 = new int[size];
	        System.out.println("Enter the elements of the array in sorted order:");
	        String line =br.readLine();
	        String[] s1=line.split(",");
	       try { 
	    	   for (int i = 0; i < size; i++) {
	            a1[i] = Integer.parseInt(s1[i]);
	        }
	       }catch (Exception e) {
	    	   String[] s2=line.split(" ");
	    	   for (int i = 0; i < size; i++) {
		            a1[i] = Integer.parseInt(s2[i]);
	    	   
	       }
	       }
	 
	        // Enter  the target value
	        System.out.print("Enter the target : ");
	        int target = Integer.parseInt(br.readLine());
	 
	        // Creating the object for search_position and return the index of the target
	        Search_Position solution = new Search_Position();
	        int result = solution.searchInsert(a1, target);
	        
	        // Printing the result
	        System.out.println(result);
	        
	     
	    }
	}
	



