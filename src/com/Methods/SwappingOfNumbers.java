package com.Methods;

import java.util.Scanner;

public class SwappingOfNumbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the num1 :");
		int num1=scan.nextInt();
		System.out.println("Enter the num2 :");
		int num2=scan.nextInt();
		
		System.out.println("Before Swapping :" +num1+ " & " +num2);
		
		Swap(num1, num2);
		
		
		
		
	}

	private static void   Swap(int num1,int num2) {
		int temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("After  Swapping :" +num1+ " & " +num2);
		
	}

}
