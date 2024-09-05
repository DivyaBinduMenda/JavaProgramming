package com.kunal.Searching;

//Enter the array size
//6
//Enter the array index of 0
//11
//Enter the array index of 1
//12
//Enter the array index of 2
//13
//Enter the array index of 3
//14
//Enter the array index of 4
//15
//Enter the array index of 5
//16
//Enter the stating index
//1
//Enter the ending index
//5
//Enter the element to find
//14
//The element found at index  3

import java.util.Scanner;

public class LS_Search_in_Range_5 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=scan.nextInt();
		int[] arr=new int[n];
		
		if (n == 0) {
            System.out.println("The element found at index -1");
            return; // Exit the program
        }
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the array index of "+i);
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the stating index");
		int start=scan.nextInt();
		System.out.println("Enter the ending index");
		int end=scan.nextInt();
		if(end>arr.length-1) {
			System.out.println("The element found at index -1");
			return ;
		}
		
		System.out.println("Enter the element to find");
		int element=scan.nextInt();
		
		int ans=search(arr,start,end,element);
		System.out.println("The element found at index  "+ans); 
	
	}
	public static int search(int[] arr,int start,int end,int element) {
		
		
		for(int i=start;i<=end;i++) {
			if(arr[i]==element) {
				return i;
			}
		}
		return -1;
		
	}

}
