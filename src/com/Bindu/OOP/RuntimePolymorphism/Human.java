package com.Bindu.OOP.RuntimePolymorphism;


//Runtime Polymorphism or Dynamic polymorphism .It is acheived by method overriding

//What is method overriding?
//Method Overriding is a feature in object-oriented programming 
//that allows a subclass (child class) to provide a specific
//implementation of a method that is already defined in its 
//superclass (parent class). The overriding method in the subclass
//must have the same name, return type, and parameters as the method 
//in the superclass.
public class Human {
	public static void main(String[] args) {
		Parent p=new Parent();
		p.humanity();
		
		Child c=new Child();
		c.money();
		c.humanity();
		
		Parent p1=new Child(); //Here the child object is assining to the parent reference ,sthis process is called upcasting
	}
	

}
 class Parent{
	void money() {
		System.out.println("Parent has money");
	}
	void humanity() {
		System.out.println("Parent has humanity");
	}
}
 
 class Child extends Parent{
	 @Override
	 void humanity() {
		 System.out.println("Child dont have humanity");
	 }
 }
