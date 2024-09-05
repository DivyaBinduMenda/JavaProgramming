package com.String_Problems;

import java.util.Arrays;

public class Remove_Duplicate_Character {
	public static void main(String[] args) {
		String name="Malayalam";
		String modify="";
		
		
	
		
		for(int i=0;i<name.length();i++) {
			if(!modify.contains(String.valueOf(name.charAt(i)))) {
				modify=modify+name.charAt(i);
				
			}
			
		}
		System.out.println(modify);
		
	}

}
