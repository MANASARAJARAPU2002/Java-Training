package com.hcltech.javaday12june11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;



public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l1 = new ArrayList();
		l1.add("manasa");
		l1.add("maanu");
		l1.add("ammu");
		l1.add("ammu");
		if(l1.isEmpty()) System.out.println("is empty");
		else {
			System.out.println(l1);
		}
		Set myset = new HashSet();
		
		myset=(Set) l1.stream().collect(Collectors.toSet());
		System.out.println(myset);
	}

}
