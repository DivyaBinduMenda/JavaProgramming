package com.kunal.Searching;


//Enter the size of array
//5
//Enter the string with the character size is 5
//bindu
//[b, i, n, d, u]
//Enter the character to find
//n
//The character found at index of 2

import java.util.Arrays;
import java.util.Scanner;

public class LS_String_Char_4 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=scan.nextInt();
		System.out.println("Enter the string with the character size is "+n);
		String str=scan.next();
		char[] arr=str.toCharArray();
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter the character to find");
		char element=scan.next().charAt(0);
		int ans=charSearch(str,arr,element);
		System.out.println("The character found at index of "+ans);
		
	}
	public static int charSearch(String str,char[] arr,char element) {
		if(str.length()==0) {
			return -1;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element) {
				return i;
			}
		}
		return -1;
		
	}

}
