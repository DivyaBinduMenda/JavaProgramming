package com.Bindu.OOP;


//Outside class must not be the static , why because the outside class not depend on anything for object
public class InnerClasses {
	
	static class Test{
		String name;

		public Test(String name) {
			super();
			this.name = name;
		}
		
	}
	public static void main(String[] args) {
		Test t1=new Test("Bindu");
		Test t2=new Test("Sindhu");
		System.out.println(t1.name);
		System.out.println(t2.name);
	}
	
	

}
