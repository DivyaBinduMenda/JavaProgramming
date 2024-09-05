package com.Bindu.Cycle_Sort;

import java.util.Arrays;

//https://leetcode.com/problems/missing-number/description/

public class LC_Missing_Number_2 {
	public static void main(String[] args) {
		int[] arr= {3,0,1};
		int missingElement=sort(arr);
		System.out.println(missingElement);
		
	}
	public static int sort(int[] arr) {
		int i=0;
		while(i<arr.length) {
			int index=arr[i];
			if(arr[i]<arr.length && arr[i]!=arr[index]) {
				swap(arr,i,index);
			}
			else {
				i++;
			}
		}
		
		//To find the missing element
		
		for(int j=0;j<arr.length;j++) {
			if(arr[j]!=j) {
				return j;
			}
		}
		return arr.length;
		
	}
	private static void swap(int[] arr, int i, int index) {
		int temp=arr[i];
		arr[i]=arr[index];
		arr[index]=temp;
		
	}
	

}
