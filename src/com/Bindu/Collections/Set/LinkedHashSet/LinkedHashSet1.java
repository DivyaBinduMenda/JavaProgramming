package com.Bindu.Collections.Set.LinkedHashSet;

import java.util.LinkedHashSet;

//LinkedHashSet follows insertion order
//It don't allow duplicates

//LinkedHashSet contains LinkedHashMap
public class LinkedHashSet1 {
	
	public static void main(String[] args) {
		
		
		//creation of Linkedhashset
		
		LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
		
		//To add the elements
		lhs.add(12);
		lhs.add(14);
		lhs.add(24);
		lhs.add(5);
		lhs.add(30);
		lhs.add(2);
		System.out.println(lhs);
		System.out.println();
		
		//To remove the elements
		lhs.remove(24);
		System.out.println(lhs);
		
		System.out.println();
		
		//To verify the element
		
		System.out.println(lhs.contains(30));

}
}
