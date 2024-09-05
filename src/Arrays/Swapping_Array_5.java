package Arrays;

//Output
//Enter the size of array
//5
//Array index of 0
//23
//Array index of 1
//56
//Array index of 2
//78
//Array index of 3
//12
//Array index of 4
//89
//Array before swapping :[23, 56, 78, 12, 89]
//Array after swapping :[23, 12, 78, 56, 89]
//

import java.util.Arrays;
import java.util.Scanner;

public class Swapping_Array_5 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=scan.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Array index of "+i);
			arr[i]=scan.nextInt();
		}
		System.out.println("Array before swapping :"+Arrays.toString(arr));
		ArraySwap(arr,1,3);
		System.out.println("Array after swapping :"+Arrays.toString(arr));
		
	}
	public static void ArraySwap(int[] arr,int index1,int index2) {
		int temp=arr[index1];
		 arr[index1]=arr[index2];
		arr[index2]=temp;
		
	}

}
