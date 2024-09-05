package com.Array_2_D;


//having different rows with different columns 

//example : when row=3, coln=2,5,1
// output is:
//[w, r]
//[e, t, g, d, g]
//[g]

//
import java.util.Arrays;
import java.util.Scanner;

public class Array_2d_4 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of row :");
		int row=scan.nextInt();
		
		char[][] arr=new char[row][];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the size of col :");
			int col=scan.nextInt();
			arr[i]=new char[col];
			for( int j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter the index of "+i+" & "+j);
				arr[i][j]=scan.next().charAt(0);;
			}
		}
		for(char[] x:arr) {
			System.out.println(Arrays.toString(x));
		}
	}

}
