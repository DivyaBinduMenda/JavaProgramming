package com.Bindu.Collections.Set.HashSet;


//Hashset dont allow duplicates and dont follow insertion order
import java.util.HashSet;



public class HashSet1 {
	
//	1)HashSet contains HashMap 
	//In hashmap keys are cant be duplcate , 
    //	so thats applicable to hahset. 
    //	BUt hashset dont have values ,
    //	it has only keys.
//	2)HashMap contains Array of nodes(key , pair)
	
	public static void main(String[] args) {
		
	
	//creation of hashset
	
	HashSet<Integer> hs=new HashSet<>();
	
	//To add the elements
	hs.add(12);
	hs.add(14);
	hs.add(24);
	hs.add(5);
	hs.add(30);
	hs.add(2);
	System.out.println(hs);
	System.out.println();
	
	//To remove the elements
	hs.remove(24);
	System.out.println(hs);
	
	System.out.println();
	
	//To verify the element
	
	System.out.println(hs.contains(30));
	
	System.out.println();
	
	
	}
	

}
