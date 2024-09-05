package Arrays;


//Enter the size of array
//6
//Array index of 0
//12
//Array index of 1
//13
//Array index of 2
//14
//Array index of 3
//15
//Array index of 4
//16
//Array index of 5
//17
//Array before swapping :[12, 13, 14, 15, 16, 17]
//Enter the index1 to swap:
//2
//Enter the indeex2 to swap:
//5
//Array after swapping :[12, 13, 17, 15, 16, 14]


import java.util.Arrays;
import java.util.Scanner;

public class Swaping_Array_6 {
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
		System.out.println("Enter the index1 to swap:");
		int index1=scan.nextInt();
		System.out.println("Enter the indeex2 to swap:");
		int index2=scan.nextInt();
		
		ArraySwap(arr,index1,index2);
		System.out.println("Array after swapping :"+Arrays.toString(arr));
		
	}
	public static void ArraySwap(int[] arr,int index1,int index2) {
		int temp=arr[index1];
		 arr[index1]=arr[index2];
		arr[index2]=temp;
		
	}

}
