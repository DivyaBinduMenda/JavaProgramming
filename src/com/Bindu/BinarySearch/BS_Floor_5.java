package com.Bindu.BinarySearch;

//Floor:find the largest number in the array <=target element

//The floor of a target value in a sorted array is the greatest element in the array that is less than or equal to the target value.
//If such an element exists, it is returned; otherwise, an indication that no such element exists is returned (commonly -1 or another sentinel value).

public class BS_Floor_5 {
	public static void main(String[] args) {
		int[] arr= {2,3,5,9,14,16,18};
		int target=10;
		int ans=floor(arr,target);
		System.out.println("The element found at index "+ans);
		
	}
	public static int floor(int[] arr,int target) {
		int start=0;
		int end=arr.length-1;
		//if the target element is smaller than the start element of array , then no ceiling
		if(target<arr[start]) {
			return -1;
		}
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]==target) {
				return mid;
				
			}
			if(target>arr[mid]) {
				start=mid+1;
			}
			else if(target<arr[mid]) {
				end=mid-1;
			}
		}
		
		
		return end;
		
	}

}
