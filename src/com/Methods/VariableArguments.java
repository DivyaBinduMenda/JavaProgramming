package com.Methods;

import java.util.Arrays;

//When we don't know how many parameters to pass
//When length is not constant
public class VariableArguments {

	public static void main(String[] args) {
		fun(2,3,4,5,6,7,8,9,4,5);

	}

	private static void fun(int ...b) {
		
		System.out.println(Arrays.toString(b));
	
	}

}
