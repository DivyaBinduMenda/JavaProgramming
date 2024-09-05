package com.Bindu.OOP;

public class Student1 {
	int roll_no;
	String name;
	int marks;
	
	Student1(int roll_no,String name,int marks){
		this.roll_no=roll_no;
		this.name=name;
		this.marks=marks;
	}
	
	
	@Override
	public String toString() {
		return "Student1 [roll_no=" + roll_no + ", name=" + name + ", marks=" + marks + "]";
	}


	public static void main(String[] args) {
		
		Student1 s1=new Student1(13,"Bindu",86);
		System.out.println(s1);
	}
	
	

}
