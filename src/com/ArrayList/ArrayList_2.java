package com.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<>();
		System.out.println("Enter the size of array");
		int n=scan.nextInt();
		for(int i=0;i<n;i++) {
			list.add(scan.nextInt());
		}
		System.out.println(list);
	}

}
