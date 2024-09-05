package com.Bindu.Collections.Set.TreeSet;


//Treeset is used for sorted order

import java.util.TreeSet;

public class TreeSet1 {
	public static void main(String[] args) {
		
		//TreeSet contains TreeMap
		
		TreeSet<Integer> ts=new TreeSet<>();
		
		//To add the elements
		ts.add(12);
		ts.add(14);
		ts.add(24);
		ts.add(5);
		ts.add(30);
		ts.add(2);
		System.out.println(ts);
		System.out.println();
		
		//To remove the elements
		ts.remove(24);
		System.out.println(ts);
		
		System.out.println();
		
		//To verify the element
		
		System.out.println(ts.contains(30));
		
		System.out.println();
		
		System.out.println(ts.first());
		System.out.println(ts.last());
		
	}

}
