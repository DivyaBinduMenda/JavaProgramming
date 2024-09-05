package com.Bindu.OOP.CompileTimePolymorphism;


//Compile Time polymorphism or static polymorphism . It is achieved via method overloading

////What is method overloading?
////Method Overloading is the process of defining multiple methods 
//with the same name within the same class, as long as the methods 
//differ in their parameter lists. The differences can be in the number, 
//type, or order of parameters. Method overloading is not dependent on the 
//return type of the method.

//Example:Multiple constructors
public class Demo1 {
	
	int sum(int a,int b) {
		return a+b;
	}
	void sum(int a, int b,int c) {
		int d=a+b+c;
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		Demo1 d=new Demo1();
		System.out.println(d.sum(3,6 ));
		d.sum(3, 4,6);
	}

}
