package com.Bindu.Strings;

public class String_Performance_7 {
	
	public static void main(String[] args) {
		String series="";
		
		for(int i=0;i<26;i++) {
			char ch=(char) ('a'+i);
			series=series+ch+" "; //series+=ch+" ";
			
		}
		System.out.println(series);
	}

}
