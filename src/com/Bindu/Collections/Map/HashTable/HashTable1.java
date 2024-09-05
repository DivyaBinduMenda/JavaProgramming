package com.Bindu.Collections.Map.HashTable;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class HashTable1 {
	
	public static void main(String[] args) {
		
		//Creation of a map
		//Map<Integer,String> m=new Hashtable<>();  This is also right
		Hashtable<Integer,String> m=new Hashtable<>();
		
		 //Addition of elements into the map
		m.put(533201, "Amalapuram");
		m.put(693204, "Siataramapuram");
		m.put(638320, "Peddapuram");
		m.put(578901, "Ananthapuram");
		
		System.out.println(m);
		
		System.out.println();
		
		//• Retrieval of keys from the map
		
		Set<Integer> keys=m.keySet();
		for (Integer key : keys) {
			System.out.println(key);
		}
		System.out.println();
		//• Retrieval of values from the map
		
		Collection<String> values=m.values();
		for (String value : values) {
			System.out.println(value);
		}
		System.out.println();
		
		//Retrieval of value from  the map based on a key
		System.out.println(m.get(638320));
		System.out.println();
		
		//Retrieval of key  and value
		for (Integer key : keys) {
			System.out.println(key+" == "+m.get(key));
		}
		
		System.out.println();
		
		//• Deletion of elements from the map
		m.remove(693204);
		
		System.out.println(m);
		System.out.println();
		
		//• Verification of keys in the map
		
		System.out.println(m.containsKey(533201));
		System.out.println(m.containsKey(12345));
		
		System.out.println();
		
		//• Verification of values in the map
		
		System.out.println(m.containsValue("hyderabad"));
		System.out.println(m.containsValue("Amalapuram"));
		
		System.out.println();
		//• Updation of elements in the map
		
		m.put(533201, "Nellore");
		System.out.println(m);
		
		System.out.println();
		
		//If key already exists then it wont add
		m.putIfAbsent(533201, "goa");
		System.out.println(m);
		System.out.println();
		
		//We can retrieve by using entryset
		
		Set<Entry<Integer,String>> entries=m.entrySet();
		for (Entry<Integer, String> entry : entries) {
			Integer key=entry.getKey();
			String value=entry.getValue();
			System.out.println(key+" == "+value);
		}
			
		
		
		
		
		
	}

}
