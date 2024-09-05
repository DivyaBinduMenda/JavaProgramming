package com.kunal.Searching;

// https://leetcode.com/problems/richest-customer-wealth/description/

//Enter the size of row
//3
//Enter the sixe of col
//2
//Enter the index of 0 & 0
//1
//Enter the index of 0 & 1
//5
//Enter the sixe of col
//2
//Enter the index of 1 & 0
//7
//Enter the index of 1 & 1
//3
//Enter the sixe of col
//2
//Enter the index of 2 & 0
//3
//Enter the index of 2 & 1
//5
//[1, 5]
//[7, 3]
//[3, 5]
//The richman with 10


import java.util.Arrays;
import java.util.Scanner;

public class RichestMan_LC_10 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the size of row");
	int rows=scan.nextInt();
	
	int[][] arr=new int[rows][];
	for(int i=0;i<arr.length;i++) {
		System.out.println("Enter the sixe of col");
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
	int ans=maxAccount(arr);
	System.out.println("The richman with "+ans);
	
	
}
public static int maxAccount(int[][] arr) {
	int ans=0;
	for(int i=0;i<arr.length;i++) {
		int sum=0;
		for(int j=0;j<arr[i].length;j++) {
			sum+=arr[i][j];
		}
		if(sum>ans) {
			ans=sum;
		}
	}
	return ans;
	
}
}

