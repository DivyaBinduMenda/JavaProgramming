package com.Bindu.OOP.Interface;
//1)In the interface every method must and should be abstract (no implementation)
//2)We can't make abstract methods as abstract externally , by default it take it as abstract
//3)we can't instantiate ( can't create the object) the interface
//4)We have to use implementation keyword for interface 
//5)Multiple number of classes can implement the interface
///6)In interface the variable is by default public static final
//7)A class can implements multiple interfaces
//8)In interface we can't create construct
//9)If we create the concrete method in interface we must and should make it as default
interface Calci{
	void show(); //point 1 and 2
	void display();
	 default void smile() {   //Point 9
		System.out.println("Nice smile");
	}
}
interface Calci0{
	void accurate();
}
class Calci1 implements Calci ,Calci0 {  //point 4 and 7

	@Override
	public void show() {
		System.out.println("hi");
		
	}

	@Override
	public void display() {
		System.out.println("Bye");
		
	}

	@Override
	public void accurate() {
		System.out.println("Hey wait");
		
	}
	
}

class Calci2 implements Calci{ //point 5

	@Override
	public void show() {
		System.out.println("HI");
		
	}

	@Override
	public void display() {
		System.out.println("bye");
		
	}
	
}
public class Interface1 {
	
	public static void main(String[] args) {
		
		//Get error
		//Calci c=new Calci();  //Point 4
		
		Calci1 c1=new Calci1();
		c1.show();
		c1.display();
		c1.smile();
		c1.accurate();
		
	}

}
