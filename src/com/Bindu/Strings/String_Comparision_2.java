package com.Bindu.Strings;

public class String_Comparision_2 {
	public static void main(String[] args) {
		
		//== is a comparator in java to compare references of object
		
		
		//When two reference variables pointing the same object
		
		String a="Bindu";
		String b="Bindu";
		
		// It will give true because the a and b pointing Bindu in the string pool of heap memory
		System.out.println(a==b);
		
		System.out.println("============");
		
		
		//when two reference variables having the same object but pointing according to their (to different) object 
		//Because we create by using new
		String a1=new String("Bindu");
		String b1=new String("Bindu");
		
		//It will give false because they are pointing to different objects , a1 is pointing to Bindu and b1 is pointing to Bindu in the outside of string pool of heap memory
		System.out.println(a1==b1);
		System.out.println("============");
		
		
		System.out.println(a==a1);//false
		
		System.out.println("============");
		
		System.out.println(b==b1);
		
		
		
	}

}
