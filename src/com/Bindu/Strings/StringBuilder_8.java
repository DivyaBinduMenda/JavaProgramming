package com.Bindu.Strings;

//By using StringBuilder we can modify string(string mutable)

public class StringBuilder_8 {
	
	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<26;i++) {
			char ch=(char) ('a'+i);
			sb.append(ch);
		}
		System.out.println(sb);
		
		sb.append(" f");
		System.out.println(sb);
		
	}

}
