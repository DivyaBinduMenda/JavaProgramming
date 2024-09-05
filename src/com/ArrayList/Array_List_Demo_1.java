package com.ArrayList;

import java.util.ArrayList;

public class Array_List_Demo_1 {
	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>(10);
		// here Integer is generic. We have to mention the generic for which type of 
		//data it is . Generic must be wrapper classes not primitives .
		list.add(67);
		list.add(234);
		list.add(235);
		list.add(236);
		list.add(237);
		list.add(238);
		list.add(239);
		list.add(23410);
		list.add(23411);
		list.add(23412);
		
		System.out.println(list);
		System.out.println(list.contains(237));
		list.remove(2);
		System.out.println(list);
		list.set(4,33);
		System.out.println(list);
		
		
		
		
	}

}
