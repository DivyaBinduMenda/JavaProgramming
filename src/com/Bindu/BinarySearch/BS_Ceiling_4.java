package com.Bindu.BinarySearch;

//ceiling: Find the smallest number in the array of  >=target element

//The ceiling of a target value in a sorted array is the smallest element in the array that is greater than or equal to the target value. 
//If such an element exists, it is returned; otherwise, an indication that no such element exists is returned (commonly -1 or another sentinel value).

public class BS_Ceiling_4 {
	public static void main(String[] args) {
		int[] arr= {2,3,5,9,14,16,18};  //here >=target means we have to search in 15, 16 18 array. So in the array 15 is not in the given array so the smallest element will be 16.
		int target=11;
		int ans=ceiling(arr,target);
		System.out.println("The element found at "+ans);
	}
	
	public static int ceiling(int[] arr,int target) {
		int start=0;
		int end=arr.length-1;
		//if the target element is greater than the end element of array , then no ceiling
		if(target > arr[end] ) {
			return -1;
		}
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]==target) {
				return mid;
			}
			if(target > arr[mid]) {
				start =mid+1;
				
			}
			else {
				end=mid-1;
			}
		}
		
		
		//if while loop condition violated then it will return start
		return start;
		
	}

}
