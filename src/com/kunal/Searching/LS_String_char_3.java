package com.kunal.Searching;

//without using array of string

//Enter the size of an array
//5
//Enter the string with 5 size
//bindu
//Enter the character to find
//u
//The character found at the index 4


import java.util.Scanner;

public class LS_String_char_3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=scan.nextInt();
		
		System.out.println("Enter the string with "+n+" size");
		String str=scan.next();
		System.out.println("Enter the character to find");
		char ch=scan.next().charAt(0);
		int ans=charSearch(str,ch);
		System.out.println("The character found at the index "+ans);
		
	}
	public static int charSearch(String str,char ch) {
		if(str.length()==0) {
			return -1;
			
		}
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				return i;
			}
		}
		return -1;
		
	}

}
