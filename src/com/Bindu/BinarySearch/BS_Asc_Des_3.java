package com.Bindu.BinarySearch;

public class BS_Asc_Des_3 {
public static void main(String[] args) {
	//int[] arr= {-18,-12,-2,0,14,56,78,99,102,143};
	int[] arr= {143,122,111,56,42,27,13,7,6,3,0,-1,-4,-8};
	int element=56;
	int ans=orderAgnosticBs(arr,element);
	System.out.println("The element found at index "+ans);
			
	
}
public static int orderAgnosticBs(int[] arr,int element) {
	int start=0;
	int end=arr.length-1;
	
	boolean isAsc=arr[start]<arr[end];
	
	while(start<=end) {
		 int mid=(start+end)/2;
		 if(element==arr[mid]) {
			 return mid;
		 }
		 //this logic is for when array is in ascending order
		 if(isAsc) {
			 if(element>arr[mid]) {
				 start=mid+1;
			 }
			 else if(element<arr[mid]) {
				 end=mid-1;
			 }
		 }
		 
		 //this logic is for when array is in descending order
		 else {
			 if(element>arr[mid]) {
				 end=mid-1;
			 }
			 else if(element<arr[mid]) {
				 start=mid+1;
			 }
		 }
	}
	return -1;
	
}
}
