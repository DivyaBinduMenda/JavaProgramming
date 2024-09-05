package Arrays;


//Array of primitives
import java.util.Arrays;
import java.util.Scanner;

public class Array_2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n=scan.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the array index of "+ i);
			arr[i]=scan.nextInt();
			
		}
		System.out.println("Arrays elements are:");
	
//		  for(int i=0;i<arr.length;i++) {
//			  System.out.print(arr[i]+" ");
//		  
//		 }
		
		
//		for(int x:arr) {
//			System.out.println(x+" ");
//		}
		
		
		System.out.println(Arrays.toString(arr));
		 
		
	}

}
