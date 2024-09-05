package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Object_3 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int n=scan.nextInt();
		String[] str=new String[n];
		for(int i=0;i<str.length;i++) {
			System.out.println("Enter the Array index of "+i);
			str[i]=scan.next();
			
		}
		System.out.println("Array elements of String:");
		System.out.println(Arrays.toString(str));
		
		if(n>=4) {
		str[3]="Avinash";
		System.out.println(Arrays.toString(str));
		}
	
	}

}
