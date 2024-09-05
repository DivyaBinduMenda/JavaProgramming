package com.Loops;

import java.util.Scanner;

public class NestedSwitchCase {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the employee ID");
		int employId=scan.nextInt();
		System.out.println("Enter the Department Name");
		String departName=scan.next();
		
		switch(employId) {
		case 1:
			System.out.println("Divya");
			break;
		case 2:
			System.out.println("Bindu");
			break;
		case 3:
			System.out.println("Divya Bindu");
			switch(departName) {
			case "IT":
				System.out.println("Working in IT Department");
				break;
			case "MANAGER":
				System.out.println("Working in a Management Department ");
				break;
			default:
				System.out.println("Check the department Name once");
			}
			break;
			default:
				System.out.println("Check the employid once");
		}
		

	}

}
