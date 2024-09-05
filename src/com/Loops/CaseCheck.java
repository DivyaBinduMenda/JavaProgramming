package com.Loops;

import java.util.Scanner;

//Question: To check the letter case

public class CaseCheck {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a character : ");

		char ch = scan.next().trim().charAt(0);

		if (ch >= 'a' && ch <= 'z') {
			System.out.println("Lower Case Letter");

		} else {
			System.out.println("Upper Case Letter");
		}

	}

}
