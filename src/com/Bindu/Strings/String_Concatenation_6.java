package com.Bindu.Strings;

import java.util.ArrayList;

public class String_Concatenation_6 {
public static void main(String[] args) {
	
	System.out.println('a'+'b'); //characters will concat their ASCII values
	
	System.out.println("a"+"b"); 
	
	System.out.println('a'+3); //character change into ASCII and concat with 3
	
	System.out.println((char)('a'+3)); //here we are mentioned explicit change them into char so chars will be concat
	
	System.out.println("a"+1);//here integer will be converted to Integer that will call toString()
	                          //So automatically it returns as "a"+"1"
	
	System.out.println("Bindu"+new ArrayList<>());
	
	System.out.println("Bindu"+new Integer(56));
	
	//System.out.println(new Integer(56)+new ArrayList<>());//it will give error
	
	System.out.println(new Integer(56)+""+new ArrayList<>());//we have to add string for two objects concatination
}

}
