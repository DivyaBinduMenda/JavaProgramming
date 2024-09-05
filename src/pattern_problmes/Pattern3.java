package pattern_problmes;

import java.util.Scanner;

//Enter the number of rows
//5
//* * * * * 
//* * * * 
//* * * 
//* * 
//* 


public class Pattern3 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the number of rows");
		int n=scan.nextInt();
		starPattern(n);
	}

	private static void starPattern(int n) {
		for(int row=1;row<=n;row++) {
			for(int col=n;col>=row;col--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
