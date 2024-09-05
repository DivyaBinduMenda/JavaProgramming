package com.kunal.Searching;


//Enter the size of array
//4
//Enter array index of 0
//bindu
//Enter array index of 1
//nandu
//Enter array index of 2
//sindu
//Enter array index of 3
//chandu
//Enter the element to find
//nandu
//The element is found at index 1


import java.util.Scanner;

public class LS_String_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = scan.nextInt();
		String[] arr = new String[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter array index of " + i);
			arr[i] = scan.next();

		}
		System.out.println("Enter the element to find");
        String element=scan.next();
        int ans=stringSearch(arr,element);
        System.out.println("The element is found at index "+ans);
	}

	public static int  stringSearch(String[] arr,String element) {
		if(arr.length==0) {
			return -1;
			
		}
		for(int i=0;i<arr.length;i++) {
			//for string equal we need to use equals()
			if(arr[i].equals(element)) {     //observe this line 
				return i;
			}
			
		}
		return -1;

	}
}
