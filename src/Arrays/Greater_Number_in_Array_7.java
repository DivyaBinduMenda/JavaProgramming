package Arrays;

//Enter the size of array:
//5
//Enter the index of 0 : 
//34
//Enter the index of 1 : 
//12
//Enter the index of 2 : 
//67
//Enter the index of 3 : 
//31
//Enter the index of 4 : 
//87
//Greater element in the array is 87


import java.util.Scanner;

public class Greater_Number_in_Array_7 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=scan.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the index of "+i+" : ");
			arr[i]=scan.nextInt();
			
		}
				int ans=greaterNum(arr);
				System.out.println("Greater element in the array is "+ans);
				
		
		
	}
	public static int greaterNum(int[] arr) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		
		return max;
	}

}
