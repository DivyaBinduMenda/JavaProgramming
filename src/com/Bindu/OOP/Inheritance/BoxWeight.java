package com.Bindu.OOP.Inheritance;

public class BoxWeight extends Box {
	double weight;
	
	public BoxWeight() {
		this.weight=-1;
		
	}
	
	public BoxWeight(double l, double h ,double w,double weight) {
		super(l,h,w); //it call the parent class constructor and used to initialize the values present in the parent class
		this.weight=weight;
	}

}
