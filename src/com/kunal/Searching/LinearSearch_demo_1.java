package com.kunal.Searching;

//Enter the size of array:
//5
//Enter Array index of 0
//25
//Enter Array index of 1
//35
//Enter Array index of 2
//45
//Enter Array index of 3
//55
//Enter Array index of 4
//65
//Enter the element to find:
//45
//Element is found at the index of 2


import java.util.Scanner;

public class LinearSearch_demo_1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=scan.nextInt();
		
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter Array index of "+i);
			arr[i]=scan.nextInt();
			
		}
		System.out.println("Enter the element to find:");
		int element=scan.nextInt();
		int ans=linearSearch(arr,element);
		System.out.println("Element is found at the index of "+ans);
		
		
	}
	public static int linearSearch(int[] arr,int element) {
		
		//return the index if element found
		//return -1 if element not found
		
		if(arr.length==0) {
			return -1;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element) {
				return i;
			}
		}
		
		
		
		return -1;
	}

}
