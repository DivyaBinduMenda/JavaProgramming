package Arrays;


//Enter the size of array:
//4
//Enter array index of 0
//12
//Enter array index of 1
//131
//Enter array index of 2
//141
//Enter array index of 3
//151
//Array before reverse
//[12, 131, 141, 151]
//Array after reverse
//[151, 141, 131, 12]


import java.util.Arrays;
import java.util.Scanner;

public class Reverse_Of_Array_8 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the size of array:");
	int n=scan.nextInt();
	int[] arr=new int[n];
	for(int i=0;i<arr.length;i++) {
		System.out.println("Enter array index of "+i);
		arr[i]=scan.nextInt();
		
	}
	System.out.println("Array before reverse");
	System.out.println(Arrays.toString(arr));
	int[] ans=arrReverse(arr);
	System.out.println("Array after reverse");
	System.out.println(Arrays.toString(ans));
	
}
public static int[] arrReverse(int[] arr) {
	
	int[] reversedArray=new int[arr.length];
	for(int i=arr.length-1;i>=0;i--) {
		reversedArray[arr.length-1-i]=arr[i];
	}
	return reversedArray;
	
	
}
}
