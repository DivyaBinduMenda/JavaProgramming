package com.Bindu.Strings;

import java.util.Scanner;

public class String_Palindrome {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the name ");
		String name=scan.next();
		boolean ans=palindrome(name);
		System.out.println(ans);
		
		
	}
	public static boolean palindrome(String name) {
		if (name==null || name.length()==0) {
			return true;
			
		}
		name=name.toLowerCase();
		for(int i=0;i<name.length();i++) {
			char start=name.charAt(i);
			char end=name.charAt(name.length()-1-i);
			
			if(start !=end) {
				return false;
			}
		}
		return true;
		
	}

}
