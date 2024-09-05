package com.Array_2_D;


// having same number of rows and columns
// example output

//1 2 3 
//4 5 6 
//7 8 9
import java.util.Scanner;

public class Array_demo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of rows");
		int row = scan.nextInt();
		System.out.println("Enter the  size of columns");
		int col = scan.nextInt();

		int[][] arr = new int[row][col];

		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr.length; j++) {
				System.out.println("Enter the index of " + i +" & "+j);

				arr[i][j] = scan.nextInt();

			}
		}

		for (int i = 0; i < arr.length;i++) {

			for (int j = 0; j < arr.length; j++) {

				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}
		
	}
}
