package com.Bindu.Collections.List.Stack;

import java.util.Stack;

//1)Stack is extends from Vector, so overrides vector
//2)But we have to imagine the elements in vector  will insert as horizontal.
//  Elements In the stack will insert in vertical.
//3)If we shift the vector anti clock wise then it is stack(Just for imagination)
//Stack follows LIFO( Last In First Out) rule


public class Stack1 {

	public static void main(String[] args) {
		
	
	Stack<String> s=new Stack<>();
	
	//Creation of elements
	
	s.add("White");
	s.add("Blue");
	s.add("Red");
	s.add("Green");
	System.out.println(s);
	
	System.out.println("====");
	
	//To retrieve the data
	
	System.out.println(s.get(0));
	
	System.out.println("====");
	
	//To remove the element
	s.remove(0);
	System.out.println(s);
	
	System.out.println("====");
	
	//To check wheather the element is present or not
	
	System.out.println(s.contains("Red"));
	
	System.out.println("===");
	
	//	To update the element
	
	s.set(2, "Pink");
	System.out.println(s);
	
	
	}
	
	
}



