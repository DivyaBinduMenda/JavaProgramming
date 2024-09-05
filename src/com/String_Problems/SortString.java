package com.String_Problems;

public class SortString {
	public static void main(String[] args) {
		String str="Bindu";
		
		String str2=str.toLowerCase();
		char[] ch=str2.toCharArray();
		
		char[] ans=sort(ch);
		System.out.println(ans);
		
		
		
	}
	static char[] sort(char[] ch) {
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]>ch[j]) {
					char temp=ch[j];
					ch[j]=ch[i];
					ch[i]=temp;
					
					
				}
			}
		}
		return ch;
		
	}

}
