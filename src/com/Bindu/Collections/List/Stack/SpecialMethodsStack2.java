package com.Bindu.Collections.List.Stack;

import java.util.Stack;

//1)Stack extends vector but stack itself has its own methods.
//They are:1)Push  2)Pop  3)Peek  4)search

//What is the default capacity of stack? (Capacity when elements are not added to the stack) //10
//✴ What is the initial capacity of stack? //10
//✴ Does stack allow duplicate elements? //Yes
//✴ Does stack allow null values? //Yes
//✴ Does stack maintain the insertion order? //Yes
//✴ Does stack maintain the sorted order?  //No
//✴ Does stack offer the random access of elements?  //Yes , we should not use it
//✴ Is stack synchronized? //Yes
//✴ What is stack good at? //LIFO Scenarioes  
//-- Ex:1)Undo and redo  , 
//      2)Browser back forward and frontforward application

public class SpecialMethodsStack2 {
	public static void main(String[] args) {
		
	Stack<Integer> s=new Stack<>();
	
	//To create elements (push)
	s.push(3);
	s.push(6);
	s.push(9);
	s.push(12);
	s.push(15);
	
	System.out.println(s);
	
	System.out.println("==");
	
	//To print or get the last element (peek)
	System.out.println(s.peek());
	
	System.out.println("===");
	
	//To remove the last element (pop)
	s.pop();
	System.out.println(s);
	
	System.out.println("====");
	
	//To search the element by search (search)
	
	System.out.println(s.search(12));//Search will search from last index
	
	System.out.println("====");
	//To search the element by indexOf
	
	System.out.println(s.indexOf(12));
	
	
	}

}
