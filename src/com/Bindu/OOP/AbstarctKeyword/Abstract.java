package com.Bindu.OOP.AbstarctKeyword;

//1)The abstract keyword is applicable only for the class and methods not for the variables.
//2)If the method has no implementation then we must and should make its as abstract method.It is called abstract method
//3)If there is even one abstract method is present in class, we must and should make the class a abstract.It is called abstract class
//4)Abstract class can also has implementation method
//5)If the class has all abstract methods , then it is 100% abstraction , that means it is hiding data 100%
//6)The abstract methods must and should implemented by sub classes
//7)We can't instantiate (can't create the object of) the abstract class.
abstract class Demo{  //point 3
	
	abstract void show();//point 2
	
	
	void display() { //point 4
		System.out.println("Hi");
	}
	
}
class Demo2 extends Demo{
	

	@Override
	void show() { //point6
		System.out.println("bye");
		
	}
}

public class Abstract {
	public static void main(String[] args) {
		
		//We will get error
		// Demo d=new Demo();  //point 7
		
		Demo2 d2=new Demo2();
		d2.display();
		d2.show();
	}
	
	

}
