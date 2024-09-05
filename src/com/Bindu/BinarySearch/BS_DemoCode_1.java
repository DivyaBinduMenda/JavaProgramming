package com.Bindu.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

//Linear Search: Simple, works on unsorted lists, time complexity is O(n).Used in small or unsorted datasets.
//Binary Search: More complex, requires sorted lists, time complexity is O(log n).Used in large, sorted datasets for efficient searching.

//Find the array is in ascending order or not
//Find the middle element
//If the target element > middle element ==>then search in right (start=middle+1,end=end)
//If the target element < middle element ==>Then search in left  (end=middle-1,start=start)
//If  the target element == middle element ==>Its the answer
//If start index > end index ==>Element not found

//Enter the size of array
//7
//Enter the index of 0
//11
//Enter the index of 1
//12
//Enter the index of 2
//13
//Enter the index of 3
//14
//Enter the index of 4
//15
//Enter the index of 5
//16
//Enter the index of 6
//17
//[11, 12, 13, 14, 15, 16, 17]
//Enter the element to find
//16
//The element found at index 5


public class BS_DemoCode_1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=scan.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the index of "+i);
			arr[i]=scan.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter the element to find");
		int element =scan.nextInt();
		int ans=binarySearch(arr,element);
		System.out.println("The element found at index "+ans);
	}
	
	public static int binarySearch(int[] arr,int element) {
		int start=0;
		int end=arr.length-1;
		while (start<=end) {
			int mid=(start+end)/2;   //for large number of array we can use ==>int mid=start+(end-start)/2
			if(element>arr[mid]) {
				start=mid+1;
			}
			else if(element<arr[mid]) {
				end=mid-1;
			}
			else { //else if(element==arr[mid])
				return mid;
			}
		}
		return -1;
		
	}
	

}