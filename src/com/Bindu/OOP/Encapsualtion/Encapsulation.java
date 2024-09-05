package com.Bindu.OOP.Encapsualtion;


//Encapsulation is the process of Binding the data members and method in a single unit to 
//protect the data from outside world

//To secure the data we use the private access modifier for the data members
//To access that private data members , we used setters and getters
class Encaps{
	private String name;
	 private int age;
	void diplay() {
		System.out.println("Welcome to the page");
	}
	
	//set the data to data members
	public void setName(String name) {
		this.name = name;
	}
	
	//get the data from data members
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
		if(age>=18) {
		
		System.out.println("You are eligible");
		}
		else {
			System.out.println("You are not eligible "+"beacuase your age is "+age);
		}
	}
	
	public int getAge() {
		return age;
	}
	
	void submission() {
		System.out.println("Page close successfully");
	}
	
	
	
}
public class Encapsulation {
	
	public static void main(String[] args) {
		
		Encaps e=new Encaps();
		e.diplay();
		e.setName("Bindu");
		System.out.println(e.getName());
		e.setAge(12);
		
		System.out.println(e.getAge());
		e.submission();
	}
	
	
	
	

}
