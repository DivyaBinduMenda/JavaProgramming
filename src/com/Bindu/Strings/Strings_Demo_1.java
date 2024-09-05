package com.Bindu.Strings;

//In java primitives are in stack memory and objects are in heap memory

// Strings are objects , so they are in heap memory


//Strings are immutable for security reasons

public class Strings_Demo_1 {
	public static void main(String[] args) {
		String name="Bindu";
		
		System.out.println(name);
		
		//we can not modify , we can create new objects to the same reference variable 
		//so Bindu will go to garbage collector and print Santhi only
		name="santhi";
		System.out.println(name);
	}

}
