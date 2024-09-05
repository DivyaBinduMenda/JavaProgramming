package com.kunal.Searching;

//Enter the size of row
//4
//Enter the size of col
//3
//Enter the index of 0 & 0
//11
//Enter the index of 0 & 1
//121
//Enter the index of 0 & 2
//13
//Enter the size of col
//1
//Enter the index of 1 & 0
//14
//Enter the size of col
//4
//Enter the index of 2 & 0
//15
//Enter the index of 2 & 1
//16
//Enter the index of 2 & 2
//17
//Enter the index of 2 & 3
//19
//Enter the size of col
//2
//Enter the index of 3 & 0
//20
//Enter the index of 3 & 1
//21
//[11, 121, 13]
//[14]
//[15, 16, 17, 19]
//[20, 21]
//Enter the element to find
//16
//Tne element found at the index
//[2, 1]


import java.util.Arrays;
import java.util.Scanner;

public class LS_2D_SEARCH_7 {
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter the size of row");
		int row=scan.nextInt();
		
		int[][] arr=new int[row][];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the size of col");
			int col=scan.nextInt();
			arr[i]=new int[col];
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the index of "+i+" & "+j);
				arr[i][j]=scan.nextInt();
				
			}
		}
		for(int[] x:arr) {
			System.out.println(Arrays.toString(x));
		}
		System.out.println("Enter the element to find");
		int element=scan.nextInt();
		
		
		int[] ans=twodimentionSearch(arr,element);
		System.out.println("Tne element found at the index");
		System.out.println(Arrays.toString(ans));
	}
	
	public static int[] twodimentionSearch(int[][] arr,int element) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]==element) {
					return new int[] {i,j};
				}
			}
		}
		return new int[] {-1,-1};
		
	}
	

}


