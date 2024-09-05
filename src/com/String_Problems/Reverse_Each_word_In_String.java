package com.String_Problems;

import java.util.Arrays;

public class Reverse_Each_word_In_String {
	public static void main(String[] args) {
		String str="welcome to java";
		
		String[] words=str.split(" ");
		System.out.println(Arrays.toString(words));
		
		for(int i=0;i<words.length;i++) {
			char[] arr=words[i].toCharArray();
			int start=0;
			int end=arr.length-1;
			
			while(start<end) {
				char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
			}
			words[i]=new String(arr);
		}
		String result = String.join(" ", words);
        System.out.println(result);
		
	}

}
