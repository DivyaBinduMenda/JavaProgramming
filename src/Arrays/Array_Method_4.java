package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Method_4 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n=scan.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter array index of "+i);
			arr[i]=scan.nextInt();
			
		}
		
			int[] ans=arrayMethod(arr);
		System.out.println(Arrays.toString(ans));
			
	}
	public static int[] arrayMethod(int[] arr) {
		
		return arr;
		
	}

}
