package com.kunal.Searching;

//Enter the size of rows
//4
//Enter the size of col
//3
//Enter the index at 0 & 0
//111
//Enter the index at 0 & 1
//12
//Enter the index at 0 & 2
//4
//Enter the size of col
//4
//Enter the index at 1 & 0
//16
//Enter the index at 1 & 1
//19
//Enter the index at 1 & 2
//0
//Enter the index at 1 & 3
//134
//Enter the size of col
//2
//Enter the index at 2 & 0
//0
//Enter the index at 2 & 1
//4
//Enter the size of col
//4
//Enter the index at 3 & 0
//234
//Enter the index at 3 & 1
//45
//Enter the index at 3 & 2
//236
//Enter the index at 3 & 3
//7
//[111, 12, 4]
//[16, 19, 0, 134]
//[10, 4]
//[234, 45, 236, 7]
//The minimum number of index is[1, 2]
//The maximum number of index is[3, 2]


import java.util.Arrays;
import java.util.Scanner;

public class LS_2D_min_max_8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of rows");
		int row = scan.nextInt();
		int[][] arr = new int[row][];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the size of col");
			int col = scan.nextInt();
			arr[i] = new int[col];
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter the index at " + i + " & " + j);
				arr[i][j] = scan.nextInt();
			}
		}
		for (int[] x : arr) {
			System.out.println(Arrays.toString(x));
		}

		int[] minAns = minSearch(arr);
		System.out.print("The minimum number of index is");
		System.out.println(Arrays.toString(minAns));

		int[] maxAns = maxSearch(arr);
		System.out.print("The maximum number of index is");
		System.out.println(Arrays.toString(maxAns));

	}

	public static int[] minSearch(int[][] arr) {
		int min = arr[0][0];
		int[] minIndex= {0,0};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] < min) {
					min=arr[i][j];
					minIndex= new int[] { i, j };
				}
			}
		}
		return minIndex;

	}

	public static int[] maxSearch(int[][] arr) {
		int max = arr[0][0];
        int[] maxIndex = {0, 0};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > max) {
					max=arr[i][j];
					maxIndex=new int[] {i,j};

				}
			}

		}
		return maxIndex;
	}

}
