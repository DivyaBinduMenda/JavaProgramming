package com.String_Problems;

public class Remove_WhiteSpaces {
public static void main(String[] args) {
	String name="  Bi  nd  u      ";
	String modify=name.replaceAll("\\s+","");//to remove white spaces we use \\s in java
	System.out.println(modify);
}
}
