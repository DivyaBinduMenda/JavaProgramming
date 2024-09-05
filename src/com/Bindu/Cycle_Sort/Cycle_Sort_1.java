package com.Bindu.Cycle_Sort;

import java.util.Arrays;

//When given numbers from range 1 to N  (continuous elements) then use CYcle Sort 

//Index =element value-1.

public class Cycle_Sort_1 {
	
	public static void main(String[] args) {
		int[] arr= {5,2,3,1,4,8,6,7,10,9};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void sort(int[] arr) {
		int i=0;
		while(i<arr.length) {
			int index=arr[i]-1;
			if(arr[i]!=arr[index]) {
				swap(arr,i, index);
			}
			else {
				i++;
			}
			
		}
		
	}

	private static void swap(int[] arr, int i, int index) {
		int temp=arr[i];
		arr[i]=arr[index];
		arr[index]=temp;
		
	}

}
