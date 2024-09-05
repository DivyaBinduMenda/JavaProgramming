package com.Bindu.Collections.List.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

//What is the default capacity of linkedlist? (Capacity when elements are not added to the linkedlist) //0
//✴ What is the initial capacity of linkedlist? //0
//✴ Does linkedlist allow duplicate elements?  //Yes
//✴ Does linkedlist allow null values?  //Yes
//✴ Does linkedlist maintain the insertion order? //Yes
//✴ Does linkedlist maintain the sorted order?  //No
//✴ Does linkedlist offer the random access of elements? //Yes
//✴ Is linkedlist synchronized? //Bydefault not synchronized
//✴ What is linkedlist good at? //To add the data in b/w , 
                                 //Beacuse there is no shifting of data is done


public class LinkedList1 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("S1");
		al.add("52");
		
		LinkedList<String> l1 = new LinkedList<>();
		l1.add("Y1");
		l1.add("Y2");
		l1.add("Y3");
		l1.add(1, "YY");
		l1.addAll(al);
		System.out.println(l1);
		
		System.out.println("===");
		
		//Remove
		l1.remove(1);
		System.out.println(l1);
		
		System.out.println("====");
		//To retrive
		
		System.out.println(l1.get(0));
		
		System.out.println("===");
		//Contains
		
	   System.out.println(l1.contains("bindu"));
	   System.out.println("====");
	   
	   //Tp update
	   
	   l1.set(0, "Job");
	   System.out.println(l1);
	   
		}
	

	


}
