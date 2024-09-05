package com.Bindu.OOP;

//the static variable is used to assign that same value for every object
public class Human_StaticVariable {
	
	int age;
	String name;
	int salary;
	boolean married;
	static long population;
	
	
	
	
	public Human_StaticVariable(int age, String name, int salary, boolean married) {
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
		this.married = married;
	    Human_StaticVariable.population+=1;
	}


	


	@Override
	public String toString() {
		return "Human_StaticVariable [age=" + age + ", name=" + name + ", salary=" + salary + ", married=" + married
				+ "]";
	}





	public static void main(String[] args) {
		Human_StaticVariable h1=new Human_StaticVariable(22, "Bindu", 300000, false);
		Human_StaticVariable h2=new Human_StaticVariable(23, "Divya", 400000, true);
		Human_StaticVariable h3=new Human_StaticVariable(24,  "Navya", 500000, false);
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
		
		System.out.println("======");
		System.out.println(Human_StaticVariable.population);
		System.out.println(Human_StaticVariable.population);
		System.out.println(Human_StaticVariable.population);
	
	}

	
	}

	


