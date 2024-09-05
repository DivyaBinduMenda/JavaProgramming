package com.Bindu.OOP;

public class StaticBlock {
	static int a=4;
	static int b;
	
	
	//will only run once, when the first obj is create i.e when the class is loaded for the first time
	static {
		System.out.println("HI my name is Divya Bindu");
		b=a*4;
	}
	
	public static void main(String[] args) {
		StaticBlock s1=new StaticBlock();
		System.out.println(StaticBlock.a+" "+StaticBlock.b);
		
		StaticBlock.b+=4;
		System.out.println(StaticBlock.a+" "+StaticBlock.b);
		
		StaticBlock s2=new StaticBlock();
		System.out.println(StaticBlock.a+" "+StaticBlock.b);
		
		
	}
}