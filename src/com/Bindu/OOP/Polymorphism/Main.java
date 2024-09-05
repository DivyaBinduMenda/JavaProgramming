package com.Bindu.OOP.Polymorphism;

public class Main {

	public static void main(String[] args) {
		Shape s=new Shape();
		Triangle t=new Triangle();
		Square s1=new Square();
		Circle c=new Circle();
		
		Shape c1=new Square ();
		Shape t1=new Circle();
		
		s.area();
		t.area();
		s1.area();
		c.area();
		c1.area();
		t1.area();
		
	}
}
