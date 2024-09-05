package com.Bindu.BinarySearch;

public class BS_Demo_2 {
public static void main(String[] args) {
	int[] arr= {-18,-12,-2,0,14,56,78,99,102,143};
	int element=56;
	int ans=binarySearch(arr,element);
	System.out.println("The element found at index "+ans);
	
}
public static int binarySearch(int[] arr,int element) {
	int start=0;
	int end=arr.length-1;
	while(start<=end) {
		int mid=(start+end)/2;
		if(element>arr[mid]) {
			start=mid+1;
		}
			else if(element<arr[mid]) {
			end=mid-1;	
			}	
			else if(element==arr[mid]) {
				return mid;
			}
			
		
	}
	return -1;
	
}
}
