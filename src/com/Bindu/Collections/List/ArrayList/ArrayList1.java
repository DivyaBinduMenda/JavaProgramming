package com.Bindu.Collections.List.ArrayList;

import java.util.ArrayList;

//What is the default capacity of arrayList? (Capacity when elements are not added to the arrayList)  //0
//✴ What is the initial capacity of arrayList? //10
//✴ Does arraylist allow duplicate elements? //yes
//✴ Does arraylist allow null values? //Yes 
//✴ Does arraylist maintain the insertion order?//yes
//✴ Does arraylist maintain the sorted order?//No
//✴ Does arraylist offer the random access of elements? //yes
//✴ Is arraylist synchronized? //No , but we can access by using synchronized class of collection
//✴ What is arraylist good at? //To add and to retrieve the data, 
                                 // not for the adding the data in b/w , 
                                //beacuse the data has to be shift to left , 
                                //it will take time for shifting

//In ArrayList the size will increment by 50% only

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList<String> arli=new ArrayList<>();
		//creation of elements
		arli.add("Bindu");
		arli.add("Jagan");
		arli.add("Baby");
		System.out.println(arli);
		System.out.println("Size :"+arli.size());
		
		System.out.println("====");
		//Retrieval of elements
		System.out.println(arli.get(0));
		
		System.out.println("===");
		
		//To remove element
		arli.remove(2);
		System.out.println(arli);
		
		System.out.println("===");
		
		//To check whether element is present or not
		
		System.out.println(arli.contains("Bindu"));
		System.out.println("===");
		
		//To update the elements
		arli.set(0, "DivyaBindu");
		arli.set(1, "JaganMohanRao");
		System.out.println(arli);
		
//		for (String string : arli) {
//			System.out.println(string);
//		}
//		
//		
		
	}
	

}
