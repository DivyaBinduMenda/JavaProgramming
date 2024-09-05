package com.Loops;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int n= scan.nextInt();
		
		int ans=0;
		
		while(n>0) {
		
		int rem=n%10;
		
		ans = ans*10 + rem;
		n=n/10;
		
		}
		System.out.println(ans);
		

	}

}
