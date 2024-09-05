package com.Array_2_D;

import java.util.Arrays;

//string program
//having different rows and columns
//row =3; col=4

//output :
// bimdu ssinu busnj dhsk 
// hhiii hdwwi hdhjk dugf 
// hfdhj bghud hfdjj dugf 

import java.util.Scanner;

public class Array_2D_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of rows:");
		int row = scan.nextInt();
		System.out.println("Enter the sixe of col:");
		int col = scan.nextInt();

		String[][] arr = new String[row][col];

		for (int i = 0; i < arr.length; i++) {
			for (int j= 0; j < arr[i].length; j++) {
				System.out.println("Enter the index of " + i+ " & " + j);
				arr[i][j] = scan.next();
			}
		}
//		for (int i = 0; i< arr.length; i++) {
//			for (int j = 0; j< arr[i].length; j++) {
//				System.out.print(arr[i][j] + " ");
//
//			}
//			System.out.println();
//
//		}
		
		for(String[] x:arr) {
			System.out.println(Arrays.toString(x));
		}
	}

}
