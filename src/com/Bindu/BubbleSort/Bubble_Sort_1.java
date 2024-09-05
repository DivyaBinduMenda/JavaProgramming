package com.Bindu.BubbleSort;

import java.util.Arrays;

//Bubble sort is used to elements to be sorted.

//Bubble sort also known as sinking sort or exchange sort

//with the first pass through the array, the largest element come to the end.

//In every step we have to compare adjacent elements

//if n=5; then  iterations  from 0 to 3 like i=0,1,2,3 . Formula is i=n-2 , so i=5-2=3.
//And for every iteration , the comparison is n-2-i.

//Best Case: O(n)when the array is already sorted
//Average Case:O(n^2) 
//Worst Case:O(n^2)

//def:In bubble sort , we swap the 2 adjacent elements and putting the max elements into the last index by different iterations.

public class Bubble_Sort_1 {

	public static void main(String[] args) {
		int[] arr= {11,56,100,2,121,0,132};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	public static void bubbleSort(int[] arr) {
		//for iterations 
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					 int temp=arr[j+1];
					 arr[j+1]=arr[j];
					 arr[j]=temp;
					
				}
			}
			
		}
	}
}
