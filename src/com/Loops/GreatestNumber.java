package com.Loops;

// Question : Find the greatest number out of 3 numbers
import java.sql.Array;
import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		int max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}

		// int max=Math.max(c,Math.max(a, b));

		System.out.println(max);
	}

}
