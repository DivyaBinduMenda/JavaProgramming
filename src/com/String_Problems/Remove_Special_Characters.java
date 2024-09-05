package com.String_Problems;

public class Remove_Special_Characters {
	public static void main(String[] args) {
		String name="@123B8i#%n**d)u";
		
		String modify=name.replaceAll("[^a-zA-Z]", ""); //If string has other than [^a-zA-Z] replace them with ""
		System.out.println(modify);
	}
	

}
