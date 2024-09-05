package com.Bindu.OOP.Inheritance;

public class Box {
	
	double l;
	double h;
	double w;
	
	public Box() {
		
		this.l = -1;
		this.h = -1;
		this.w = -1;
	}

	
	//cube
	
	public Box(double side) {
		super();
		this.w = side;
		this.h = side;
		this.l = side;
	}


	public Box(double l, double h, double w) {
		super();
		this.l = l;
		this.h = h;
		this.w = w;
	}
	
	public Box(Box old) {
		this.h=old.h;
		this.l=old.l;
		this.w=old.w;
	}
	
	public void imformation() {
		System.out.println("Running the box");
	}
	
	
	
	
	

}
