package com.Bindu.Strings;

public class Equals_Method_3 {
	public static void main(String[] args) {

//In string equals() does not care about reference and   objects ets , it just care about the values are equal are not 

		String a = "Bindu";
		String b = "Bindu";

		System.out.println(a.equals(b));
		System.out.println("============");

		String a1 = new String("Bindu");
		String b1 = new String("Bindu");
		
		System.out.println(a1.equals(b1));

		System.out.println("============");
		System.out.println(a.equals(b1));
		System.out.println("============");
		System.out.println(a1.equals(b));

	}

}
