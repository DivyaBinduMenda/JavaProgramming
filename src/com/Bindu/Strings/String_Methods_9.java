package com.Bindu.Strings;

import java.util.Arrays;

public class String_Methods_9 {
	public static void main(String[] args) {
		String name="Divya Bindu";
		System.out.println(name);
		System.out.println(Arrays.toString(name.toCharArray()));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.indent(4));
		System.out.println(name.indexOf('a'));
		System.out.println("  santhi   ".strip());
		System.out.println(Arrays.toString(name.split(" ")));
				
	}

}
