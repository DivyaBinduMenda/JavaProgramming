package com.Array_2_D;


//Having different size of rows and columns
// example row=5;  col=2
// output =

//1 2 
//3 4 
//5 6
//2 5 
//7 8

import java.util.Scanner;

public class Array_demo_2D_2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the size of rows: ");
		int row=scan.nextInt();
		System.out.println("Enter the size of col :");
		int col=scan.nextInt();
		
		int[][] arr=new int [row][col];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {   //Observe this line
				System.out.println("Enter the index of "+i +" & "+j);
				arr[i][j]=scan.nextInt();
				
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
