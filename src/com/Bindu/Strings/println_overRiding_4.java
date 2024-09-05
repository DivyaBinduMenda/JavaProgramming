package com.Bindu.Strings;

import java.util.Arrays;

public class println_overRiding_4 {
	public static void main(String[] args) {
		//println is override method
		//Open the declaration of println
		
		System.out.println(56);
		
		System.out.println("bindu");
		
		System.out.println(new int[] {2,3,4}); //here it will print hash code as random
		
		System.out.println(Arrays.toString(new int[] {2,3,4})); //here toString is overloading , we are writing our own method
		
		String name=null;
		System.out.println(name);
	}

}
