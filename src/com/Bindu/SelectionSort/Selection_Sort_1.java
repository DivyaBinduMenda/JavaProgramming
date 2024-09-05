package com.Bindu.SelectionSort;

import java.util.Arrays;

//Best Case: O(n^2)
//Average Case:O(n^2) 
//Worst Case:O(n^2) 

//max number will swap into last index
//Not Stable: It does not maintain the relative order of equal elements.

//Def:In selection sort, first find the max element in array and swapping that with  last index and again find the max element in the array of before the last index, so on... 
public class Selection_Sort_1 {
	public static void main(String[] args) {
		int[] arr= {5,3,2,4,11,56,78,0,1,123};
		
		sorting(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void sorting(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int end=arr.length-1-i;
			
			int maxIndex=getMaxIndex(arr,end);
			
			swap(arr, maxIndex,end);
			
		}
	}
	
	public  static void swap(int[] arr,int first, int second) {
		int temp=arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
		
				
	}

	public  static int getMaxIndex(int[] arr,int end) {
		int max=0;
		for(int i=0;i<=end;i++) {
			if(arr[i]>arr[max]) {
				max=i;
			}
		}
		
		
		return max;
	}
	
	
	

}
