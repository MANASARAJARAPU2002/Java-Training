package com.hcltech.javaday13june12;
import java.util.*;
import java.lang.*;
import java.io.*;
public class HashmapDemo {

	public static void main(String[] args) {
	
				HashMap<Integer,String> hm=new HashMap<Integer,String>();
				hm.put(1,"Ammu");
				hm.put(3,"maanu"); 
				hm.put(5,"Chitti");
				hm.put(2,"maansi");
				System.out.println("Hashmap:");
				for (Map.Entry m:hm.entrySet()) {
					System.out.println(m.getKey()+" "+m.getValue());
				}
			}
		}


	


