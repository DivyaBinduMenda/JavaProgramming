package com.kunal.Searching;


//Enter the size of array
//6
//Enter the array idex of 0
//11
//Enter the array idex of 1
//12
//Enter the array idex of 2
//6
//Enter the array idex of 3
//7
//Enter the array idex of 4
//3
//Enter the array idex of 5
//23
//Minimum number found at the index 4


import java.util.Scanner;

public class LS_Min_Num_6 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of array");
	    int n=scan.nextInt();
	    
	    if(n==0){
	    	System.out.println("Element found at the index -1");
	    	return;
	    }
	    
	    int[] arr=new int[n];
	    for(int i=0;i<arr.length;i++) {
	    	System.out.println("Enter the array idex of "+i);
	    	arr[i]=scan.nextInt();
	    }
	    
	    
	    
	    int ans=minNumSearch(arr);
	    System.out.println("Minimum number found at the index "+ans);
	}
	public static int minNumSearch(int[] arr) {
		int minIndex=0;
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
				minIndex=i;
			}
			
		}
		
		return minIndex;
		
	}

}
