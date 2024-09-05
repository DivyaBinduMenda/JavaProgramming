package com.Bindu.OOP.FinalKeyword;

public class Human {
	public static void main(String[] args) {
		
		GrandParent g=new GrandParent();
		g.money();
		g.behaviour();
		g.hairColour();
		
		Parent p=new Parent();
		p.money();
		p.behaviour();
		p.hairColour();
		
		Son s=new Son();
		s.money();
		s.behaviour();
	}

}
class GrandParent{
	 final String str="NAVYA";
	 //str="Bindu"; //once the varaible make as final , we cant modify that value
	void money() {
		System.out.println("GrandParent has money");
	}
	void behaviour() {
		System.out.println("Garndparent has good behavior");
		
	}
	void hairColour() {
		System.out.println("GrandParent has hair black colour");
	}
}
class Parent extends GrandParent{
	@Override
	void money() {
		System.out.println("Parent has money");
	}
	@Override
	void behaviour() {
		System.out.println("Parent has good behavior");
		
	}
	
	@Override
	 final void hairColour() {
		System.out.println("Parent has hair black colour");
	}
}

 final class Son extends Parent{
	 @Override
	 void money() {
		 System.out.println("Son has money");
	 }
	 @Override
	 void behaviour() {
			System.out.println("Son has good behavior");
			
		}
	 
	 //this is give error because we can't override the final methods
//	 void hairColour() {
//			System.out.println("Parent has hair black colour");
//		}
 }
 
// class GrandSon extends Son{ //This is error beacuse we can't inherit the final class
//	 
// }
