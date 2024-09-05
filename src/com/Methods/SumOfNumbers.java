package com.Methods;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the num1 :");
		int num1=scan.nextInt();
		System.out.println("Enter the num2");
		int num2=scan.nextInt();
		int ans=Sum(num1, num2);
		System.out.println("Sum of "+num1+" & "+num2+" is :"+ ans);

	}
	public static int  Sum(int num1, int num2) {
		int sum=num1+num2;
		return sum;
	}

}
