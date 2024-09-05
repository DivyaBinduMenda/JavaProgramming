package com.String_Problems;

import java.util.Arrays;

public class Reverse_String_With_Preserving_White_Space {
	public static void main(String[] args) {
		
		String str="Hello How are you";
		
		char[] arr=str.toCharArray();
		char[] reversedarr=new char[arr.length];
		
		System.out.println(Arrays.toString(arr));
		
		char[] ans=reverse_String(arr,reversedarr);
		System.out.println(Arrays.toString(ans));
		
		
	}
	public static char[] reverse_String(char[] arr,char[] reversedarr) {
		
		//to fill the reversed array with spaces
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==' ') {
				reversedarr[i]=arr[i];
				
			}
		}
		
		//to reverse the char array
		int j=reversedarr.length-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=' ') {
				if(reversedarr[j]==' ') {
					j--;
				}
				reversedarr[j]=arr[i];
				j--;
			}
			
		}
		String str = new String(reversedarr);
				return reversedarr;
		
	}

}
