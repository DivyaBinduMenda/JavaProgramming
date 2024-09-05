package com.Bindu.Strings;

import java.util.Scanner;

public class String_Palindrome_10 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		String name=scan.next();
		
		
		
		
		int len=name.length();
		
		String rev="";
		for(int i=len-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
		
		if(rev.equals(name)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}

		}
	

}
