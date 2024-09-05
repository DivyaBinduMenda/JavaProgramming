package com.Bindu.OOP.Inheritance;

public class Main {
	
	public static void main(String[] args) {
		Box box1=new Box(4.6,7.9,9.9);
		Box box2=new Box(3.3,4.6,7.8);
		System.out.println(box1.h+" "+box1.l+" "+box1.w);
		System.out.println(box2.h+" "+box2.l+" "+box2.w);
		
		BoxWeight box3=new BoxWeight();
		BoxWeight box4=new BoxWeight(2,3,4,8);
		System.out.println(box3.h+" "+box3.weight);
	}

}
