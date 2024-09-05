package com.Methods;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=scan.nextInt();
		boolean ans=isPrime(num);
		System.out.println(ans);

	}

	private static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		int c=2;
		while(c*c<=num) {
			if(num%c==0) {
				return false;
			}
			c++;
		}
		if(c*c>num) {
			return true;
		}
		return false;
		
		
	}

}
