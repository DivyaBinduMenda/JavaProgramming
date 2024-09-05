package Arrays;


//Enter the size of array: 
//4
//Enter the array index of 0
//11
//Enter the array index of 1
//121
//Enter the array index of 2
//131
//Enter the array index of 3
//141
//Array before reverse
//[11, 121, 131, 141]
//Array after reverse
//[141, 131, 121, 11]
  

//This is code two pointer method problem

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_Of_Array_9 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n=scan.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the array index of "+i);
			arr[i]=scan.nextInt();
		}
		System.out.println("Array before reverse");
		System.out.println(Arrays.toString(arr));
		reverse(arr);
		 System.out.println("Array after reverse");
		System.out.println(Arrays.toString(arr));
		
	}
	public static void reverse(int[] arr) {
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			swap(arr,start,end);
			start++;
			end--;
		}
		
		
	}
	public static void swap(int[] arr,int index1,int index2) {
		int temp=arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
	}

}
